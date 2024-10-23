package com.example.tfi_is.service;

import com.example.tfi_is.dto.PatientRequest;
import com.example.tfi_is.dto.PatientResponse;
import com.example.tfi_is.exception.HealthInsuranceNotFoundException;
import com.example.tfi_is.exception.PatientNotFoundException;
import com.example.tfi_is.model.HealthInsurance;
import com.example.tfi_is.model.Patient;
import com.example.tfi_is.repository.HealthInsuranceRepository;
import com.example.tfi_is.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class PatientService {
    private final PatientRepository patientRepository;
    private final HealthInsuranceRepository healthInsuranceRepository;

    public PatientResponse create(PatientRequest request) throws HealthInsuranceNotFoundException {
        HealthInsurance healthInsurance = healthInsuranceRepository.findById(request.getHealthInsuranceId())
                .orElseThrow(() -> new HealthInsuranceNotFoundException("HealthInsurance not found"));
        var patient = Patient.builder()
                .passportNumber(request.getPassportNumber())
                .dateOfDeath(request.getDeathDate())
                .memberNumber(request.getMemberNumber())
                .healthInsurance(healthInsurance)
                .build();
        Patient savedPatient = patientRepository.save(patient);
        return new PatientResponse(savedPatient);
    }

    public List<PatientResponse> getAll() {
        return patientRepository.findAll().stream()
                .map(PatientResponse::new)
                .toList();
    }


}
