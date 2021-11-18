package com.example.magazine.service;

import com.example.magazine.dao.UserRepository;
import com.example.magazine.domain.User;
import com.example.magazine.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder byCryptPasswordEncoder;

    public void save (User user){
        user.setPassword(byCryptPasswordEncoder.encode(user.getPassword()));
        user.setPassword(byCryptPasswordEncoder.encode(user.getPasswordConfirm()));
        user.setRole(UserRole.USER);
        userRepository.save(user);
    }
}
