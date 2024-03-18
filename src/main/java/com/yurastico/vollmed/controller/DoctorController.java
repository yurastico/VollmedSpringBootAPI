package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.doctor.Doctor;
import com.yurastico.vollmed.doctor.DoctorCreateData;
import com.yurastico.vollmed.doctor.DoctorListingData;
import com.yurastico.vollmed.doctor.DoctorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;
    @PostMapping
    @Transactional
    public void createDoctor(@RequestBody @Valid DoctorCreateData data) {
        repository.save(new Doctor(data));

    }

    @GetMapping
    public List<DoctorListingData> listDoctors() {
        return repository.findAll().stream().map(DoctorListingData::new).toList();
    }

}
