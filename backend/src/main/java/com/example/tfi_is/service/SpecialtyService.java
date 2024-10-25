package com.example.tfi_is.service;

import com.example.tfi_is.dto.SpecialtyRequest;
import com.example.tfi_is.dto.SpecialtyResponse;
import com.example.tfi_is.model.Specialty;
import com.example.tfi_is.repository.SpecialtyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialtyResponse create(SpecialtyRequest request) {
        var specialty = new Specialty().builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();
        Specialty savedSpecialty = specialtyRepository.save(specialty);
        return new SpecialtyResponse(savedSpecialty);
    }

    public List<SpecialtyResponse> getAll() {
        return specialtyRepository.findAll().stream()
                .map(SpecialtyResponse::new)
                .toList();
    }
}
