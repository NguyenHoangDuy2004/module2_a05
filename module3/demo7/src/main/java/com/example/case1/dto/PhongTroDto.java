package com.example.case1.dto;

public class PhongTroDto {
    private int id;
    private String name ;
    private String phoneNumber ;
    private String starDate ;
    private String description ;
    private String thanhToan ;

    public PhongTroDto() {
    }

    public PhongTroDto(int id, String name, String phoneNumber, String starDate, String description, String thanhToan) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.starDate = starDate;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }
}
