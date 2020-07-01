package com.codegym.service.khachhang;

import com.codegym.model.khachhang.LoaiKhach;

import java.util.List;

public interface LoaiKhachService {
    List<LoaiKhach> findAll();

    LoaiKhach findById(Integer id);

    void save(LoaiKhach loaiKhach);

    void remove(Integer id);
}
