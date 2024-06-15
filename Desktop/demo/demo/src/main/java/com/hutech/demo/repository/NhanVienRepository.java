package com.hutech.demo.repository;

import com.hutech.demo.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
