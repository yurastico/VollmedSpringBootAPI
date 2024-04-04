package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.domain.doctor.DetailDoctorData;
import com.yurastico.vollmed.domain.doctor.Doctor;
import com.yurastico.vollmed.domain.doctor.DoctorCreateData;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @PostMapping
    @Transactional
    public Response/Entity createPatient(@RequestBody @Valid PatientCreateData data, UriComponentsBuilder uriBuilder) {
        var doctor = new Patient(data);
        repository.save(doctor);
        var uri = uriBuilder.path("/patients/{id}").buildAndExpand(doctor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetailDoctorData(patient));

    }
    @PostMapping
    @Transactional
    public Response/Entity createPatient(@RequestBody @Valid PatientCreateData data, UriComponentsBuilder uriBuilder) {
        var doctor = new Patient(data);
        repository.save(doctor);
        var uri = uriBuilder.path("/patients/{id}").buildAndExpand(doctor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetailDoctorData(patient));

    }

    public void deletePatient() j{
        
    }



}
