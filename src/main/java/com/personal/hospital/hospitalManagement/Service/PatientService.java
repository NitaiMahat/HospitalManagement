package com.personal.hospital.hospitalManagement.Service;

import com.personal.hospital.hospitalManagement.Entity.Patient;
import com.personal.hospital.hospitalManagement.Repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PatientService {


    private final PatientRepository patientRepository;



    @Transactional
    public Patient getPatientById(Long id) {

       Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();
        p1.setName("Yoyo");

        return p1;
    }

}
