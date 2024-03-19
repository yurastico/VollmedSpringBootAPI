package com.yurastico.vollmed.doctor;

import com.yurastico.vollmed.address.Address;

public record DetailDoctorData(Long id, String name, String email, String crm,String phone, Specialization specialization, Address address) {
    public DetailDoctorData(Doctor doctor) {
        this(doctor.getId(), doctor.getName(),doctor.getEmail() ,doctor.getCrm(),doctor.getPhone(),doctor.getSpecialization(),doctor.getAddress());
    }
}
