package com.codegym.service.khachhang.Impl;

import com.codegym.model.khachhang.KhachHang;
import com.codegym.repository.khachhang.KhachHangRepository;
import com.codegym.service.khachhang.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }


    @Override
    public KhachHang findByIdKhachHang(String id) {
        return khachHangRepository.findByIdKhachHang(id);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void deleteByIdKhachHang(String id) {
        khachHangRepository.deleteByIdKhachHang(id);
    }

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public Page<KhachHang> findByHoTenContainingOrIdKhachHangContaining(String keyword, String keyword2, Pageable pageable) {
        return khachHangRepository.findByHoTenContainingOrIdKhachHangContaining(keyword,keyword2,pageable);
    }
}
