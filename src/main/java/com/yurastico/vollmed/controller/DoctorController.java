package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.doctor.Doctor;
import com.yurastico.vollmed.doctor.DoctorCreateData;
import com.yurastico.vollmed.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;
    @PostMapping
    public void createDoctor(@RequestBody DoctorCreateData data) {
        repository.save(new Doctor(data));

    }

}