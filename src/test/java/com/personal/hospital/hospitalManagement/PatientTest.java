package com.personal.hospital.hospitalManagement;

import com.personal.hospital.hospitalManagement.Entity.Patient;
import com.personal.hospital.hospitalManagement.Repository.PatientRepository;
import com.personal.hospital.hospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

        Patient p1 = new Patient();
        patientRepository.save(p1);
    }

    @Test
    public void testTransactionMethods(){
        Patient patient = patientService.getPatientById(1L);

        System.out.println(patient);
    }
}
