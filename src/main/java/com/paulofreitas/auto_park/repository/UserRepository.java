package com.paulofreitas.auto_park.repository;

import com.paulofreitas.auto_park.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}