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
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMedicine;

    private String commercialName;
    private String genericName;

    @ManyToOne
    @JoinColumn(name = "digital_prescription_id")
    private DigitalPrescription digitalPrescription;
}
