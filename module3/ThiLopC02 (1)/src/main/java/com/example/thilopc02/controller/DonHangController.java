package com.example.thilopc02.controller;

import com.example.thilopc02.model.DonHang;
import com.example.thilopc02.model.DonHangDto;
import com.example.thilopc02.model.SanPham;
import com.example.thilopc02.service.IDonHangService;
import com.example.thilopc02.service.ISanPhamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/donhang")
public class DonHangController {
    @Autowired
    private IDonHangService donHangService;
    @Autowired
    private ISanPhamService sanPhamService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false) Date ngayMua, @RequestParam(required = false) Integer SanPham , @RequestParam(required = false, defaultValue = "0")int page) {
        Pageable pageable = PageRequest.of(page,2);
        Page<DonHang> list;
            list = donHangService.hienThi(pageable);
        model.addAttribute("list",list);
        model.addAttribute("listSanPham",sanPhamService.hienThi());
        model.addAttribute("ngayMua",ngayMua);
        model.addAttribute("sanpham",SanPham);
        return "result";
    }


    @GetMapping("/edit/{id}")
    public String showEditDonHangForm(@PathVariable("id") Long id, Model model) {
        DonHangDto donHangDto = donHangService.getDonHangById(id); // Lấy thông tin đơn hàng từ service
        model.addAttribute("donHang", donHangDto);
        model.addAttribute("sanPham", sanPhamService.hienThi()); // Lấy danh sách sản phẩm
        return "edit"; // Trả về trang edit-order.html
    }

    // Xử lý khi submit form
    @PostMapping("/edit")
    public String updateOrder(@Valid @ModelAttribute("donHang") DonHangDto donHangDto,
                              BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("sanPham", sanPhamService.hienThi());
            return "edit";
        }

        // Lưu đơn hàng nếu không có lỗi
        donHangService.update(donHangDto);
        return "redirect:/donhang"; // Chuyển hướng về danh sách đơn hàng
    }
}
