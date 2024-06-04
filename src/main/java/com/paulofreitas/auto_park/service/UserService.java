package com.paulofreitas.auto_park.service;

import com.paulofreitas.auto_park.entity.User;
import com.paulofreitas.auto_park.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User toSave(User user) {
        return userRepository.save(user);
    }
}