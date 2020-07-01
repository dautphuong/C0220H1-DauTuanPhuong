package com.codegym.service.nhanvien;

import com.codegym.model.nhanvien.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> findAll();

    NhanVien findById(Integer id);

    void save(NhanVien nhanVien);

    void remove(Integer id);
}
