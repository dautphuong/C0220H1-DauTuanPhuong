package com.codegym.service.hopdong.Impl;

import com.codegym.model.hopdong.HopDong;
import com.codegym.repository.hopdong.HopDongRepository;
import com.codegym.service.hopdong.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongServiceImpl implements HopDongService {

    @Autowired
    HopDongRepository hopDongRepository;
    @Override
    public List<HopDong> findAll() {
        return hopDongRepository.findAll();
    }

    @Override
    public HopDong findById(Integer id) {
        return hopDongRepository.findById(id).orElse(null);
    }

    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public void remove(Integer id) {
        hopDongRepository.deleteById(id);
    }
}
