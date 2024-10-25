package com.example.tfi_is.repository;

import com.example.tfi_is.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
    Optional<Specialty> findById(Integer id);
}
