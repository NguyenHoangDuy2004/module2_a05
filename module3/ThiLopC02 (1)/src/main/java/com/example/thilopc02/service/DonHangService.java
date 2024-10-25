package com.example.thilopc02.service;

import com.example.thilopc02.model.DonHang;
import com.example.thilopc02.model.DonHangDto;
import com.example.thilopc02.model.SanPham;
import com.example.thilopc02.repository.IDonHangRepository;
import com.example.thilopc02.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class DonHangService implements IDonHangService{
    @Autowired
    private IDonHangRepository donHangRepository;
    @Autowired
    private ISanPhamRepository sanPhamRepository;
    @Override
    public Page<DonHang> hienThi(Pageable pageable) {
        return donHangRepository.findAll(pageable);
    }

    @Override
    public DonHangDto getDonHangById(Long id) {
        DonHang donHang = donHangRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Đơn hàng k tìm thấy"));
        return mapToDTO(donHang);
    }

    private DonHangDto mapToDTO(DonHang donHang) {
        DonHangDto dto = new DonHangDto();
        dto.setId(dto.getId());
        dto.setNgayMua(dto.getNgayMua());
        dto.setSoLuong(dto.getSoLuong());
        dto.setId(dto.getSanPham().getId());
        return dto;
    }

    @Override
    public DonHang save(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    @Override
    public void update(DonHangDto donHangDto) {
        SanPham sanPham = sanPhamRepository.findById(donHangDto.getSanPham())
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));

        // Lấy thông tin đơn hàng từ DB
        DonHang donHang = donHangRepository.findById(donHangDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));

        // Cập nhật thông tin đơn hàng
        donHang.setNgayMua(donHangDto.getNgayMua());
        donHang.setSoLuong(donHangDto.getSoLuong());
        donHang.setSanPham(sanPham);

        // Lưu đơn hàng
        donHangRepository.save(donHang);
    }


}
