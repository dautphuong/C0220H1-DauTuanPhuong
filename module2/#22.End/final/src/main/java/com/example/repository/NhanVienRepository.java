package com.example.repository;

import com.example.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    List<NhanVien>findBySoCMNDContainingOrNgaySinhContaining(String cmnd,String ngaySinh);

    List<NhanVien>findByMaNhanVienContainingOrSoCMNDContainingOrNgaySinhContaining(String id,String cmnd,String ngaySinh);

}
