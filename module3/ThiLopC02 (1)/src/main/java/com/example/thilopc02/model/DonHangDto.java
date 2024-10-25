package com.example.thilopc02.model;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

public class DonHangDto implements Validator {
    private Integer id;
    @NotNull
    @Future(message = "Ngày mua phải lớn hơn ngày hiện tại ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayMua;
    @NotBlank(message = "Số lượng đơn hàng không dược để trống")
    @Min(value = 0, message = "Số lượng đơn hàng phải lớn 0")
    private Integer soLuong;
    @NotNull(message = "Vui lòng chọn loại sản phẩm")
    private SanPham sanPham;

    public DonHangDto() {
    }

    public DonHangDto(Integer id, Date ngayMua, Integer soLuong, SanPham sanPham) {
        this.id = id;
        this.ngayMua = ngayMua;
        this.soLuong = soLuong;
        this.sanPham = sanPham;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull @Future(message = "Ngày mua phải lớn hơn ngày hiện tại ") Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(@NotNull @Future(message = "Ngày mua phải lớn hơn ngày hiện tại ") Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public @NotBlank(message = "Số lượng đơn hàng không dược để trống") @Min(value = 0, message = "Số lượng đơn hàng phải lớn 0") Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(@NotBlank(message = "Số lượng đơn hàng không dược để trống") @Min(value = 0, message = "Số lượng đơn hàng phải lớn 0") Integer soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(@NotNull(message = "Vui lòng chọn loại sản phẩm") SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        DonHangDto donHangDto =(DonHangDto) target;
    }
}
