package com.personal.hospital.hospitalManagement.Entity;

import jakarta.persistence.*;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@Table (
        name = "patient-tbl",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name", "birthDate"})
                },
                indexes ={
                @Index(name = "idx_patient_birth_date", columnList = "birthDate")
                }
)



public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private LocalDate birthDate;

    private String email;

    private String gender;


}
