package com.codegym.service.dichvu.Impl;

import com.codegym.model.dichvu.DichVu;
import com.codegym.repository.dichvu.DichVuRepository;
import com.codegym.service.dichvu.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public DichVu findById(Integer id) {
        return dichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void remove(Integer id) {
        dichVuRepository.deleteById(id);
    }
}
