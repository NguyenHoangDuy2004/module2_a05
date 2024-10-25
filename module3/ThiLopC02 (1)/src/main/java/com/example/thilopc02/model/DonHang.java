package com.example.thilopc02.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date ngayMua;
    private int soLuong;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private SanPham sanPham;

    public DonHang() {
    }

    public DonHang(Integer id, Date ngayMua, int soLuong, SanPham sanPham) {
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

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }



    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}
