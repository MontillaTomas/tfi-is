package com.example.tfi_is.dto;

import com.example.tfi_is.model.HealthInsurance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthInsuranceResponse {
private Integer id;
private String name;

public HealthInsuranceResponse(HealthInsurance healthInsurance) {
    this.id = healthInsurance.getId();
    this.name = healthInsurance.getName();
}
}
