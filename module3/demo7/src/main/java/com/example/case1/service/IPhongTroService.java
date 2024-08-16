package com.example.case1.service;

import com.example.case1.dto.PhongTroDto;
import com.example.case1.model.PhongTro;

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
