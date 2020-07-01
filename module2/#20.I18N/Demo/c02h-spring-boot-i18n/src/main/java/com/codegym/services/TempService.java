package com.codegym.services;

import com.codegym.models.Temp;

import java.util.List;

public interface TempService {

    void save(Temp temp);

    List<Temp> findAll();
}
