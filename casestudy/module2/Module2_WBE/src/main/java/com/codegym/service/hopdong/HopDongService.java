package com.codegym.service.hopdong;


import com.codegym.model.hopdong.HopDong;

import java.util.List;

public interface HopDongService {
    List<HopDong> findAll();

    HopDong findById(Integer id);

    void save(HopDong hopDong);

    void remove(Integer id);
}
