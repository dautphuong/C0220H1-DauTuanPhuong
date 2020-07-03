package com.codegym.repository.dichvu;

import com.codegym.model.dichvu.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichVuRepository extends JpaRepository<DichVu,String> {
    Page<DichVu> findByIdDichVuContainingOrTenDichVuContaining(String keyword, String keyword2, Pageable pageable);
}
