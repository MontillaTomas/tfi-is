package com.example.tfi_is.dto;

import com.example.tfi_is.model.HealthInsurance;
import com.example.tfi_is.model.Patient;
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

public class PatientResponse {
    private Integer id;
    private Long passportNumber;
    @JsonProperty("death_date")
    private LocalDate deathDate;
    private Long memberNumber;
    @JsonProperty("health_insurance_id")
    private HealthInsuranceResponse healthInsurance;

    public PatientResponse(Patient patient) {
        this.id = patient.getId();
        this.passportNumber = patient.getPassportNumber();
        this.deathDate = patient.getDateOfDeath();
        this.memberNumber = patient.getMemberNumber();
        this.healthInsurance = new HealthInsuranceResponse(patient.getHealthInsurance());
    }
}