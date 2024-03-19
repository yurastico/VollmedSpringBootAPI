package com.yurastico.vollmed.doctor;

import com.yurastico.vollmed.address.Address;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    private String name;

    private Boolean active;
    public String getPhone() {
        return phone;
    }

    private String phone;

    public String getEmail() {
        return email;
    }

    private String email;

    public String getCrm() {
        return crm;
    }

    private String crm;

    public Specialization getSpecialization() {
        return specialization;
    }

    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    @Embedded
    private Address address;

    public Doctor(DoctorCreateData data) {
        this.active = true;
        this.name = data.name();
        this.email = data.email();
        this.crm = data.crm();
        this.specialization = data.specialization();
        this.phone = data.phone();
        this.address = new Address(data.address());
    }

    public void updateInfo(DoctorUpdateData data) {
        if (data.name() != null) {
            this.name = data.name();
        }
        if (data.phone() != null) {
            this.phone = data.phone();
        }
        if (data.address() != null) {
            this.address.updateAddress(data.address());
        }
    }

    public void deleteDoctor() {
        this.active = false;
    }
}
