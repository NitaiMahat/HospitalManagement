package com.personal.hospital.hospitalManagement;

import com.personal.hospital.hospitalManagement.Entity.Patient;
import com.personal.hospital.hospitalManagement.Entity.type.BloodGroupType;
import com.personal.hospital.hospitalManagement.Repository.PatientRepository;
import com.personal.hospital.hospitalManagement.Service.PatientService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
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
      //  Patient patient = patientRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException("Patient not " + "found with id: 1"));

       // System.out.println(patient);

       //List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1988, 3, 15),"lisa.beth@example.com");
        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1988, 3, 13));

        for(Patient patient : patientList){
            System.out.println(patient);
        }

        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
        for(Object[] obj : bloodGroupList){
            System.out.println(obj[0]+ " "+ obj[1]);
        }

    }
}
