package com.codegym.service.dichvu;

import com.codegym.model.dichvu.KieuThue;

import java.util.List;

public interface KieuThueService {
    List<KieuThue> findAll();

    KieuThue findById(Integer id);

    void save(KieuThue kieuThue);

    void remove(Integer id);
}
