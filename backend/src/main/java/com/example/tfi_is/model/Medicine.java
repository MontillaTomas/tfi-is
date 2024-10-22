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
@Table(name = "medicamento")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMedicine;

    private String commercialName;  // nombreComercial
    private String genericName;     // nombreGenerico

    @ManyToOne
    @JoinColumn(name = "idRecetaDigital")
    private DigitalPrescription digitalPrescription; // RecetaDigital
}
