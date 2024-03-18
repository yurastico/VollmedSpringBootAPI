package com.yurastico.vollmed.doctor;

public record DoctorListingData(Long id,String name, String email,String crm, Specialization specialization) {
    public DoctorListingData(Doctor doctor) {

        this(doctor.getId(),doctor.getName(),doctor.getEmail(),doctor.getCrm(),doctor.getSpecialization());
    }
}
