package com.example.thilopc02.service;

import com.example.thilopc02.model.SanPham;
import com.example.thilopc02.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements ISanPhamService{
    @Autowired
    private ISanPhamRepository sanPhamRepository;
    @Override
    public List<SanPham> hienThi() {
        return sanPhamRepository.findAll() ;
    }
}
