package com.example.tfi_is.repository;

import com.example.tfi_is.model.HealthInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, Integer> {
    Optional<HealthInsurance> findById(Integer id);
}
