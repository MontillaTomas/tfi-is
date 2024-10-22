package com.example.tfi_is.repository;

import com.example.tfi_is.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
