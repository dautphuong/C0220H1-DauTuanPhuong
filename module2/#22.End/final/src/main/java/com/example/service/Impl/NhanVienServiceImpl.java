package com.example.service.Impl;

import com.example.model.NhanVien;
import com.example.repository.NhanVienRepository;
import com.example.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(String id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    @Override
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void remove(String id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public List<NhanVien> findBySoCMNDContainingOrNgaySinhContaining(String cmnd, String ngaySinh) {
        return nhanVienRepository.findBySoCMNDContainingOrNgaySinhContaining(cmnd,ngaySinh);
    }

    @Override
    public List<NhanVien> findByMaNhanVienContainingOrSoCMNDContainingOrNgaySinhContaining(String id, String cmnd, String ngaySinh) {
        return nhanVienRepository.findByMaNhanVienContainingOrSoCMNDContainingOrNgaySinhContaining(id,cmnd,ngaySinh);
    }


}
