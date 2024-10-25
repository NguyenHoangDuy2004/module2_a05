package com.example.thilopc02.repository;

import com.example.thilopc02.model.DonHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDonHangRepository extends JpaRepository<DonHang, Long> {
    Page<DonHang> findAll(Pageable pageable);
}
