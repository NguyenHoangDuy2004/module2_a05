package com.example.thi.service;


import com.example.thi.model.ThanhToan;
import com.example.thi.repository.IThanhToanRepo;
import com.example.thi.repository.ThanhToanRepo;

import java.util.List;

public class ThanhToanService implements IThanhToanService{
    private IThanhToanRepo thanhToanRepo = new ThanhToanRepo();
    @Override
    public List<ThanhToan> getAll() {
        return thanhToanRepo.findAll();
    }
}
