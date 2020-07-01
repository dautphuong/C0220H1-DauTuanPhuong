package com.codegym.services.impl;

import com.codegym.models.Role;
import com.codegym.models.User;
import com.codegym.repository.RoleRepository;
import com.codegym.repository.UserRepository;
import com.codegym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    @Lazy
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {

        Integer id = null;
        Set<Role> roles = new HashSet<>();
        for (Role role: user.getRoles()) {
            id = Integer.parseInt(role.getName());
            roles.add(roleRepository.findById(id).get());
        }

        user.setRoles(roles);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
