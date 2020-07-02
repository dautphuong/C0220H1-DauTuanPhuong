package com.codegym.service.khachhang;

import com.codegym.model.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> findAll();

    KhachHang findById(Integer id);

    void save(KhachHang khachHang);

    void remove(Integer id);

    Page<KhachHang> findAll(Pageable pageable);
}
