package com.codegym.service.nhanvien.Impl;

import com.codegym.model.nhanvien.NhanVien;
import com.codegym.repository.nhanvien.NhanVienRepository;
import com.codegym.service.nhanvien.NhanVienService;
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
    public NhanVien findById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    @Override
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void remove(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}
