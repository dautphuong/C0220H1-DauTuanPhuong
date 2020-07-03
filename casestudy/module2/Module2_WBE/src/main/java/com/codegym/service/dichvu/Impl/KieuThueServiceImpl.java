package com.codegym.service.dichvu.Impl;

import com.codegym.model.dichvu.KieuThue;
import com.codegym.repository.dichvu.KieuThueRepository;
import com.codegym.service.dichvu.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KieuThueServiceImpl implements KieuThueService {
    @Autowired
    KieuThueRepository kieuThueRepository;
    @Override
    public List<KieuThue> findAll() {
        return kieuThueRepository.findAll();
    }

    @Override
    public KieuThue findById(Integer id) {
        return kieuThueRepository.findById(id).orElse(null);
    }

    @Override
    public void save(KieuThue kieuThue) {
        kieuThueRepository.save(kieuThue);
    }

    @Override
    public void remove(Integer id) {
        kieuThueRepository.deleteById(id);
    }
}
