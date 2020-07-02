package com.codegym.service.hopdong;


import com.codegym.model.hopdong.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HopDongService {
    List<HopDong> findAll();

    HopDong findById(Integer id);

    void save(HopDong hopDong);

    void remove(Integer id);

    List<HopDong>findByKhachHang_IdKhachHang(Integer idKhachHang);

    Page<HopDong> findAll(Pageable pageable);

    Page<HopDong>findByKhachHang_IdKhachHang(Integer idkhachhang,Pageable pageable);
}
