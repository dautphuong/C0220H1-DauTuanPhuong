package com.codegym.repository.hopdong;

import com.codegym.model.hopdong.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HopDongRepository extends JpaRepository<HopDong,Integer> {
    List<HopDong> findByKhachHang_IdKhachHang(Integer idKhachHang);
    Page<HopDong>findByKhachHang_IdKhachHang(Integer idkhachhang, Pageable pageable);
}
