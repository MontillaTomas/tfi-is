package com.example.tfi_is.repository;

import com.example.tfi_is.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findById (Integer id);
}
