package com.yurastico.vollmed.domain.patient;

import com.yurastico.vollmed.domain.doctor.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findAllByActiveTrue(Pageable pagination);
}