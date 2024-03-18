package com.yurastico.vollmed.doctor;

public record DoctorListingData(String name, String email,String crm, Specialization specialization) {
    public DoctorListingData(Doctor doctor) {

        this(doctor.getName(),doctor.getEmail(),doctor.getCrm(),doctor.getSpecialization());
    }
}
