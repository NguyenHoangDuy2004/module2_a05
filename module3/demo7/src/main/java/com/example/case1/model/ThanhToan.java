package com.example.case1.model;

public class ThanhToan {
    private int id ;
    private String thanhToan ;

    public ThanhToan() {
    }

    public ThanhToan(int id, String thanhToan) {
        this.id = id;
        this.thanhToan = thanhToan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }
}
