package com.codegym.repository;

import com.codegym.models.Temp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<Temp, Integer> {
}
