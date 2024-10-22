package com.example.tfi_is.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "receta_digital")
public class DigitalPrescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDigitalPrescription;

    @Column(nullable = false)
    private LocalDateTime date;

    private String barcode; // codigoBarras
    private String doctorElectronicSignature;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor; // Medico

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "digital_prescription_id")
    private List<Medicine> medications;
}
