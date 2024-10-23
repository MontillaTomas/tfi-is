package com.example.tfi_is.service;

import com.example.tfi_is.model.Medicine;

import java.util.List;
import java.util.Optional;

public interface MedicineService {
    List<Medicine> getAllMedicines();                  // Para obtener la lista de todos los medicamentos
    Optional<Medicine> getMedicineById(Long id);       // Para obtener un medicamento por su ID
    void deleteMedicine(Long id);                      // Para eliminar un medicamento por su ID
}
