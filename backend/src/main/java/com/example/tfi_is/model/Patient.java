package com.example.tfi_is.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient_")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true, nullable = false)
    private Long passportNumber;
    @Column(name = "death_date")
    private LocalDate dateOfDeath;
    @Column(name = "member_number", unique = true)
    private Long memberNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "healthInsurance_id")
    private HealthInsurance healthInsurance;
}
