package com.example.thi.service;

import com.example.thi.dto.PhongTroDto;
import com.example.thi.model.PhongTro;

import java.util.List;

public interface IPhongTroService {
    public List<PhongTro> findAll();
    public List<PhongTroDto> findAllDto();
    public boolean add(PhongTro phongTro);
    public boolean deleteById(int id);
    public PhongTro findById(int id);
    public boolean update(PhongTro phongTro);
    List<PhongTroDto> search(String name , int thanhToan);
}