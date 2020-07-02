package com.codegym.service.khachhang;

import com.codegym.model.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> findAll();

    KhachHang findByIdKhachHang(String id);

    void save(KhachHang khachHang);

    void deleteByIdKhachHang(String id);

    Page<KhachHang> findAll(Pageable pageable);

    Page<KhachHang>findByHoTenContainingOrIdKhachHangContaining(String keyword, String keyword2, Pageable pageable);
}
