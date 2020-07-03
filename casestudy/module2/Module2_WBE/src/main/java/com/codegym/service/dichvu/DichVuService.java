package com.codegym.service.dichvu;

import com.codegym.model.dichvu.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuService {
    List<DichVu> findAll();

    DichVu findById(String id);

    void save(DichVu dichVu);

    void remove(String id);

    Page<DichVu> findAll(Pageable pageable);

    Page<DichVu> findByIdDichVuOrTenDichVu(String keyword, String keyword2, Pageable pageable);
}
