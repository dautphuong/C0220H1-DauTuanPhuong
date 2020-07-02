package com.codegym.repository.khachhang;

import com.codegym.model.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KhachHangRepository extends JpaRepository<KhachHang,Integer> {
    Page<KhachHang>findByHoTenContainingOrIdKhachHangContaining(String keyword, String keyword2, Pageable pageable);
    
    KhachHang findByIdKhachHang(String id);

    void deleteByIdKhachHang(String id);
}
