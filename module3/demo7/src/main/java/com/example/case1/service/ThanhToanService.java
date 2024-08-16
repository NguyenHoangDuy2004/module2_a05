package com.example.case1.service;

import com.example.case1.model.ThanhToan;
import com.example.case1.repository.IThanhToanRepo;
import com.example.case1.repository.ThanhToanRepo;

import java.util.List;

public class ThanhToanService implements IThanhToanService{
    private IThanhToanRepo thanhToanRepo = new ThanhToanRepo();
    @Override
    public List<ThanhToan> getAll() {
        return thanhToanRepo.findAll();
    }
}
