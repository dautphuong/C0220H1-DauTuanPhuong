package com.example.service;

import com.example.model.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> findAll();

    NhanVien findById(String id);

    void save(NhanVien nhanVien);

    void remove(String id);

    List<NhanVien>findBySoCMNDContainingOrNgaySinhContaining(String cmnd,String ngaySinh);

    List<NhanVien>findByMaNhanVienContainingOrSoCMNDContainingOrNgaySinhContaining(String id,String cmnd,String ngaySinh);



}
