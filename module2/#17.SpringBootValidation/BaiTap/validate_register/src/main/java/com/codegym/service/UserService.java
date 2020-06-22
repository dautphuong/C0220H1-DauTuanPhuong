package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    Object findById(Integer id);

    void save(User user);

    void remove(Integer id);
}
