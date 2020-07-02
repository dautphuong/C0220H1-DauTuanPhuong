package com.codegym.service.dichvu;


import com.codegym.model.dichvu.DichVuDiKem;

import java.util.List;

public interface DichVuDiKemService {
    List<DichVuDiKem> findAll();

    DichVuDiKem findById(Integer id);

    void save(DichVuDiKem dichVuDiKem);

    void remove(Integer id);
}
