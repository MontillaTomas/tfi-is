package com.example.tfi_is.controller;

import com.example.tfi_is.dto.SpecialtyRequest;
import com.example.tfi_is.dto.SpecialtyResponse;
import com.example.tfi_is.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/specialty")
@RequiredArgsConstructor
public class SpecialtyController {

    private final SpecialtyService specialtyService;
    @PostMapping
    public SpecialtyResponse create(@RequestBody SpecialtyRequest request) {
        return specialtyService.create(request);
    }

    @GetMapping
    public List<SpecialtyResponse> getAll() {
        return specialtyService.getAll();
    }
}
