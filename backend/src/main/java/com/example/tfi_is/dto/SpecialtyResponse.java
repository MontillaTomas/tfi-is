package com.example.tfi_is.dto;


import com.example.tfi_is.model.Specialty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecialtyResponse {
    private Integer id;
    private String name;
    private String description;

    public SpecialtyResponse(Specialty specialty) {
        this.id = specialty.getId();
        this.name = specialty.getName();
        this.description = specialty.getDescription();
    }
}
