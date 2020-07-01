package com.codegym.services.impl;

import com.codegym.models.Temp;
import com.codegym.repository.TempRepository;
import com.codegym.services.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempRepository tempRepository;

    @Override
    public void save(Temp temp) {
        tempRepository.save(temp);
    }

    @Override
    public List<Temp> findAll() {
        return tempRepository.findAll();
    }
}
