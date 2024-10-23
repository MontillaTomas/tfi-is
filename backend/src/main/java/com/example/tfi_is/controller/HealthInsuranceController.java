package com.example.tfi_is.controller;

import com.example.tfi_is.dto.HealthInsuranceRequest;
import com.example.tfi_is.dto.HealthInsuranceResponse;
import com.example.tfi_is.dto.PatientRequest;
import com.example.tfi_is.dto.PatientResponse;
import com.example.tfi_is.exception.HealthInsuranceNotFoundException;
import com.example.tfi_is.exception.PatientNotFoundException;
import com.example.tfi_is.service.HealthInsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ht")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class HealthInsuranceController {

    private final HealthInsuranceService healthInsuranceService;
    @PostMapping("/createHI")
    public HealthInsuranceResponse create(@RequestBody HealthInsuranceRequest request)  {
        return healthInsuranceService.create(request);
    }

    @GetMapping("/getAll")
    public List<HealthInsuranceResponse> getAll() {
        return healthInsuranceService.getAll();
    }
}
