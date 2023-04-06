package com.example.BuySell.services;

import com.example.BuySell.models.Role;
import com.example.BuySell.models.User;
import com.example.BuySell.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser(User user){
        if(userRepository.findByEmail(user.getEmail())!=null) return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.USER);
        log.info("Saving new User with email" + user.getEmail());
        userRepository.save(user);
        return true;
    }
}
