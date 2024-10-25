package com.example.tfi_is.service;

import com.example.tfi_is.dto.DoctorCreateRequest;
import com.example.tfi_is.dto.DoctorResponse;
import com.example.tfi_is.exception.SpecialtyNotFoundException;
import com.example.tfi_is.model.Doctor;
import com.example.tfi_is.model.Specialty;
import com.example.tfi_is.repository.DoctorRepository;
import com.example.tfi_is.repository.SpecialtyRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final SpecialtyRepository specialtyRepository;

    public DoctorResponse create(DoctorCreateRequest request) throws SpecialtyNotFoundException {

            Specialty doctorSpecialty = specialtyRepository.findById(request.getSpecialtyId()).orElseThrow(() -> new SpecialtyNotFoundException("Specialty not found"));

            var doctor = Doctor.builder()
                    .licenseNumber(request.getLicenseNumber())
                    .specialty(doctorSpecialty)
                    .build();

            Doctor savedDoctor = doctorRepository.save(doctor);

            return new DoctorResponse(savedDoctor);

        }

    public List<DoctorResponse> getAll() {
            return doctorRepository.findAll().stream()
                    .map(DoctorResponse::new)
                    .toList();
        }


    }
