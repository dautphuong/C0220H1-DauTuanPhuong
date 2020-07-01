package com.codegym.service.khachhang.Impl;

import com.codegym.model.khachhang.LoaiKhach;
import com.codegym.repository.khachhang.LoaiKhachRepository;
import com.codegym.service.khachhang.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiKhachServiceImpl implements LoaiKhachService {

    @Autowired
    LoaiKhachRepository loaiKhachRepository;
    @Override
    public List<LoaiKhach> findAll() {
        return loaiKhachRepository.findAll();
    }

    @Override
    public LoaiKhach findById(Integer id) {
        return loaiKhachRepository.findById(id).orElse(null);
    }

    @Override
    public void save(LoaiKhach loaiKhach) {
        loaiKhachRepository.save(loaiKhach);
    }

    @Override
    public void remove(Integer id) {
        loaiKhachRepository.deleteById(id);
    }
}
