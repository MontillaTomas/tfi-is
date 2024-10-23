package com.example.tfi_is.dto;

import com.example.tfi_is.model.HealthInsurance;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PatientRequest {
private Long passportNumber;
@JsonProperty("death_date")
    private LocalDate deathDate;
    private Long memberNumber;
    @JsonProperty("health_insurance_id")
    private Integer healthInsuranceId;
}
