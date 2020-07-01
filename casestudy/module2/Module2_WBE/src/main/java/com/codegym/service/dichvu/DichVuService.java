package com.codegym.service.dichvu;

import com.codegym.model.dichvu.DichVu;
import com.codegym.model.khachhang.KhachHang;

import java.util.List;

public interface DichVuService {
    List<DichVu> findAll();

    DichVu findById(Integer id);

    void save(DichVu dichVu);

    void remove(Integer id);
}
