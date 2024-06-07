package com.paulofreitas.auto_park.web.controller;

import com.paulofreitas.auto_park.entity.User;
import com.paulofreitas.auto_park.service.UserService;
import com.paulofreitas.auto_park.web.dto.UserCreateDto;
import com.paulofreitas.auto_park.web.dto.UserPasswordDto;
import com.paulofreitas.auto_park.web.dto.UserResponseDto;
import com.paulofreitas.auto_park.web.dto.mapper.UserMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@Valid @RequestBody UserCreateDto createDto) {
        User newUser = userService.toSave(UserMapper.toUser(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.toDto(newUser));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getById(@PathVariable Long id) {
        User user = userService.searchById(id);
        return ResponseEntity.ok(UserMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> updatePassword(@PathVariable Long id, @RequestBody UserPasswordDto dto) {
        User user = userService.editPassword(id, dto.getCurrentPassword(), dto.getNewPassword(), dto.getConfirmPassword());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll() {
        List<User> users = userService.searchAll();
        return ResponseEntity.ok(UserMapper.toListDto(users));
    }
}