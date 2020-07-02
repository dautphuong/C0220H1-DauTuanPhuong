package com.codegym.service.hopdong;

import com.codegym.model.hopdong.HopDongChiTiet;

import java.util.List;

public interface HopDongChiTietService {
    List<HopDongChiTiet> findAll();

    HopDongChiTiet findById(Integer id);

    void save(HopDongChiTiet hopDongChiTiet);

    void remove(Integer id);

    List<HopDongChiTiet> findByHopDong_IdHopDong(Integer idHopDong);
}
