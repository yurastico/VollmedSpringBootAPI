package com.yurastico.vollmed.controller;

import com.yurastico.vollmed.domain.appointment.AppointmentData;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @PostMapping
    public ResponseEntity schedule(@RequestBody @Valid AppointmentData data) {

    }
}
