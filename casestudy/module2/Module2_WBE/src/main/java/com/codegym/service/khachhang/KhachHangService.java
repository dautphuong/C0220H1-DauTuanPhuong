package com.codegym.service.khachhang;

import com.codegym.model.khachhang.KhachHang;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> findAll();

    KhachHang findById(Integer id);

    void save(KhachHang khachHang);

    void remove(Integer id);
}
