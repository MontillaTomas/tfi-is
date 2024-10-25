package com.example.tfi_is.controller;

import com.example.tfi_is.dto.DoctorCreateRequest;
import com.example.tfi_is.dto.DoctorResponse;
import com.example.tfi_is.exception.SpecialtyNotFoundException;
import com.example.tfi_is.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    public DoctorResponse create(@RequestBody DoctorCreateRequest request) throws SpecialtyNotFoundException{
        return doctorService.create(request);
    }

    @GetMapping
    public List<DoctorResponse> getAll() {
        return doctorService.getAll();
    }

}
