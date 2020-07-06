package com.example.service;

import com.example.model.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> findAll();

    NhanVien findById(Integer id);

    void save(NhanVien nhanVien);

    void remove(Integer id);

    List<NhanVien>findBySoCMNDContainingOrNgaySinhContaining(String cmnd,String ngaySinh);




}
