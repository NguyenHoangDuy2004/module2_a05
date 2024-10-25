package com.example.thilopc02.service;

import com.example.thilopc02.model.DonHang;
import com.example.thilopc02.model.DonHangDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.Optional;

public interface IDonHangService {

    Page<DonHang> hienThi(Pageable pageable);


    DonHangDto getDonHangById(Long id);

    DonHang save(DonHang donHang);

    void update(DonHangDto donHangDto);
}
