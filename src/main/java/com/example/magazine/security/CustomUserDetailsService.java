package com.example.magazine.security;

import com.example.magazine.dao.UserRepository;
import com.example.magazine.dao.UserRolesRepository;
import com.example.magazine.domain.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public class CustomUserDetailsService  implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRolesRepository userRolesRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByEmail(email);

        if(userOptional.isPresent()){
            List<String> userRoles = userRolesRepository.findUserRoleByUserName(email);
            return new CustomUserDetails(userOptional.get(), userRoles);
        }
        throw new UsernameNotFoundException("No user presert with user email:"+ email);

    }
}
