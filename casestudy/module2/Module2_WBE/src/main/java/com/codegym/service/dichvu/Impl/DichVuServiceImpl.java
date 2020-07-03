package com.codegym.service.dichvu.Impl;

import com.codegym.model.dichvu.DichVu;
import com.codegym.repository.dichvu.DichVuRepository;
import com.codegym.service.dichvu.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    DichVuRepository dichVuRepository;

    @Override
    public List<DichVu> findAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public DichVu findById(String id) {
        return dichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void remove(String id) {
        dichVuRepository.deleteById(id);
    }

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }

    @Override
    public Page<DichVu> findByIdDichVuContainingOrTenDichVuContaining(String keyword, String keyword2, Pageable pageable) {
        return dichVuRepository.findByIdDichVuContainingOrTenDichVuContaining(keyword,keyword2,pageable);
    }
}
