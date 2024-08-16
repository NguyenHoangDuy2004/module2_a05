package com.example.case1.service;

import com.example.case1.dto.PhongTroDto;
import com.example.case1.model.PhongTro;
import com.example.case1.repository.IPhongTroRepo;
import com.example.case1.repository.PhongTroRepo;

import java.util.List;

public class PhongTroService implements IPhongTroService{
    private IPhongTroRepo phongTroRepo = new PhongTroRepo();

    @Override
    public List<PhongTro> findAll() {
        return phongTroRepo.findAll();
    }

    @Override
    public List<PhongTroDto> findAllDto() {
        return phongTroRepo.findAllDto();
    }

    @Override
    public boolean add(PhongTro phongTro) {
        return phongTroRepo.add(phongTro);
    }

    @Override
    public boolean deleteById(int id) {
        return phongTroRepo.deleteById(id);
    }

    @Override
    public PhongTro findById(int id) {
        return phongTroRepo.findById(id);
    }

    @Override
    public boolean update(PhongTro phongTro) {
        return phongTroRepo.update(phongTro);
    }

    @Override
    public List<PhongTroDto> search(String name, int thanhToan) {
        return phongTroRepo.search(name, thanhToan);
    }
}