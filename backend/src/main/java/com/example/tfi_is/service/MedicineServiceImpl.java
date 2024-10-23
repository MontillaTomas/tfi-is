package com.example.tfi_is.service.impl;

import com.example.tfi_is.model.Medicine;
import com.example.tfi_is.repository.MedicineRepository;
import com.example.tfi_is.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineServiceImpl implements MedicineService {

    private final MedicineRepository medicineRepository;

    @Autowired
    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }


    @Override
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();  // Retorna todos los medicamentos
    }

    @Override
    public Optional<Medicine> getMedicineById(Long id) {
        return medicineRepository.findById(id);  // Busca el medicamento por su ID
    }

    @Override
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);  // Elimina el medicamento por su ID
    }


}
