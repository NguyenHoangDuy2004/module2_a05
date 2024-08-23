package com.example.thi.model;

public class PhongTro {
    private int id;
    private String name;
    private String numberPhone;
    private String startDate;
    private String description;
    private int thanhToan;

    public PhongTro() {
    }

    public PhongTro(int id, String name, String numberPhone, String startDate, String description, int thanhToan) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.startDate = startDate;
        this.description = description;
        this.thanhToan = thanhToan;
    }

    public PhongTro(String name, String numberPhone, String startDate, String description , int thanhToan) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.startDate = startDate;
        this.description = description;
        this.thanhToan = thanhToan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(int thanhToan) {
        this.thanhToan = thanhToan;
    }


}
