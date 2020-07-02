package com.codegym.repository.hopdong;

import com.codegym.model.hopdong.HopDongChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HopDongChiTietRepository extends JpaRepository<HopDongChiTiet,Integer> {
    List<HopDongChiTiet> findByHopDong_IdHopDong(Integer idHopDong);
}
