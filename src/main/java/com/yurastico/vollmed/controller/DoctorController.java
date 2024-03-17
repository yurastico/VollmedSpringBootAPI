package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.doctor.DoctorCreateData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @PostMapping
    // DTO - DATA TRANSFER OBJECT
    public void createDoctor(@RequestBody DoctorCreateData data) {
        System.out.println(data);

    }

}
