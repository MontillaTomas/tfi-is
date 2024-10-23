package com.example.tfi_is.controller;


import com.example.tfi_is.dto.PatientRequest;
import com.example.tfi_is.dto.PatientResponse;
import com.example.tfi_is.exception.HealthInsuranceNotFoundException;
import com.example.tfi_is.exception.PatientNotFoundException;
import com.example.tfi_is.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/createPatient")
    public PatientResponse create(@RequestBody PatientRequest request) throws HealthInsuranceNotFoundException {
        return patientService.create(request);
    }

    @GetMapping("/getAll")
    public List<PatientResponse> getAll() {
        return patientService.getAll();
    }
}
