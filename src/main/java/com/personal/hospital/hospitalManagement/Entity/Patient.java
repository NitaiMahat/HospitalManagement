package com.personal.hospital.hospitalManagement.Entity;

import com.personal.hospital.hospitalManagement.Entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table (
        name = "patient",
        uniqueConstraints = {
               // @UniqueConstraint(name = "unique_patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name", "birth_date"})
                },
                indexes ={
                @Index(name = "idx_patient_birth_date", columnList = "birth_date")
                }
)



public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable =false, length = 40)
    private String name;


    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(unique = true, nullable = false)
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "blood_group")
    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;


}
