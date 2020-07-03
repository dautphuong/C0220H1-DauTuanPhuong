package com.codegym.repository.khachhang;

import com.codegym.model.khachhang.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface KhachHangRepository extends JpaRepository<KhachHang,String> {
    Page<KhachHang>findByHoTenContainingOrIdKhachHangContaining (String keyword, String keyword2, Pageable pageable);

}
