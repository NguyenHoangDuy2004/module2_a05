package com.example.thilopc02.repository;

import com.example.thilopc02.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISanPhamRepository extends JpaRepository<SanPham, Long> {
}
