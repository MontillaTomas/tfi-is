package com.example.tfi_is.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "healthInsurance_")

public class HealthInsurance {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "health_insurance_name")
    private String name;

}
