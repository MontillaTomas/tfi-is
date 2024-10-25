package com.example.tfi_is.dto;

import com.example.tfi_is.model.Doctor;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponse {
    private Integer id;
    @JsonProperty("license_number")
    private Integer licenseNumber;
    @JsonProperty("specialty_id")
    private Integer specialtyId;

    public DoctorResponse(Doctor doctor) {
        this.id = doctor.getId();
        this.licenseNumber = doctor.getLicenseNumber();
        this.specialtyId = doctor.getSpecialty().getId();
    }
}
