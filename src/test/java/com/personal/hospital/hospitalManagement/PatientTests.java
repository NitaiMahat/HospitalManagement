package com.personal.hospital.hospitalManagement;
import com.personal.hospital.hospitalManagement.Entity.Patient;
import com.personal.hospital.hospitalManagement.Repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRepository(){

        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
}
