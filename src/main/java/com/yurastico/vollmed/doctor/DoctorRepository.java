package com.yurastico.vollmed.doctor;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.Doc;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Page<Doctor> findAllByActiveTrue(Pageable pagination);
}
