package com.example.tfi_is.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorCreateRequest {

    @JsonProperty("license_number")
    private Integer licenseNumber;
    @JsonProperty("specialty_id")
    private Integer specialtyId;

}
