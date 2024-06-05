package com.paulofreitas.auto_park.service;

import com.paulofreitas.auto_park.entity.User;
import com.paulofreitas.auto_park.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User toSave(User user) {
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User searchById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!")
        );
    }

    @Transactional
    public User editPassword(Long id, String password) {
        User user = searchById(id);
        user.setPassword(password);
        return user;
    }

    @Transactional(readOnly = true)
    public List<User> searchAll() {
        return userRepository.findAll();
    }
}