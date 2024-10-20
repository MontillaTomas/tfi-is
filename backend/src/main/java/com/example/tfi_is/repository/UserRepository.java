package com.example.tfi_is.repository;

import com.example.tfi_is.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
