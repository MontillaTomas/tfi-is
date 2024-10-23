package com.example.tfi_is.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "diagnosis")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;

    @CreationTimestamp
    @Column(name = "diagnosis_date", updatable = false)
    private Instant diagnosisDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medical_record_id", nullable = false)
    private MedicalRecord medicalRecord;

    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "diagnosis")
    private List<EvolutionReport> evolutionReports;

    @OneToMany( fetch = FetchType.LAZY,
                cascade = CascadeType.ALL,
                mappedBy = "diagnosis")
    private List<LaboratoryOrder> laboratoryOrders;
}
