package com.example.tfi_is.repository;

import com.example.tfi_is.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer>{
}
