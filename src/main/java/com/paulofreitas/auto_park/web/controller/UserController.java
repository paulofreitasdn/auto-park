package com.paulofreitas.auto_park.web.controller;

import com.paulofreitas.auto_park.entity.User;
import com.paulofreitas.auto_park.service.UserService;
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
    public ResponseEntity<User> create(@RequestBody User user) {
        User newUser = userService.toSave(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        User user = userService.searchById(id);
        return ResponseEntity.ok(user);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody User user) {
        User updateUserPassword = userService.editPassword(id, user.getPassword());
        return ResponseEntity.ok(updateUserPassword);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.searchAll();
        return ResponseEntity.ok(users);
    }
}