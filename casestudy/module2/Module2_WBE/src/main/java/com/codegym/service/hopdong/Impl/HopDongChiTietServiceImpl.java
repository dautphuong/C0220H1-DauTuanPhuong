package com.codegym.service.hopdong.Impl;

import com.codegym.model.hopdong.HopDongChiTiet;
import com.codegym.repository.hopdong.HopDongChiTietRepository;
import com.codegym.service.hopdong.HopDongChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongChiTietServiceImpl implements HopDongChiTietService {
    @Autowired
    HopDongChiTietRepository hopDongChiTietRepository;
    @Override
    public List<HopDongChiTiet> findAll() {
        return hopDongChiTietRepository.findAll();
    }

    @Override
    public HopDongChiTiet findById(Integer id) {
        return hopDongChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public void save(HopDongChiTiet hopDongChiTiet) {
        hopDongChiTietRepository.save(hopDongChiTiet);
    }

    @Override
    public void remove(Integer id) {
        hopDongChiTietRepository.deleteById(id);
    }

    @Override
    public List<HopDongChiTiet> findByHopDong_IdHopDong(Integer idHopDong) {
        return hopDongChiTietRepository.findByHopDong_IdHopDong(idHopDong);
    }
}
