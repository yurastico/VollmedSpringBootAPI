package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.doctor.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DoctorListingData> listDoctors(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination) {
        return repository.findAll(pagination).map(DoctorListingData::new);
    }

    @PutMapping
    @Transactional
    public void updateDoctor(@RequestBody @Valid DoctorUpdateData data) {
        var doctor = repository.getReferenceById(data.id());
        doctor.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteDoctor(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
