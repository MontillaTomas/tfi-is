package com.example.tfi_is.service;

import com.example.tfi_is.dto.HealthInsuranceRequest;
import com.example.tfi_is.dto.HealthInsuranceResponse;
import com.example.tfi_is.dto.PatientResponse;
import com.example.tfi_is.model.HealthInsurance;
import com.example.tfi_is.repository.HealthInsuranceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HealthInsuranceService {

    private final HealthInsuranceRepository healthInsuranceRepository;

    public HealthInsuranceResponse create(HealthInsuranceRequest request) {
        var healthInsurance = HealthInsurance.builder()
                .name(request.getName())
                .build();
        HealthInsurance savedHealthInsurance = healthInsuranceRepository.save(healthInsurance);
        return new HealthInsuranceResponse(savedHealthInsurance);

    }

        public List<HealthInsuranceResponse> getAll() {
            return healthInsuranceRepository.findAll().stream()
                    .map(HealthInsuranceResponse::new)
                    .toList();
        }

}
