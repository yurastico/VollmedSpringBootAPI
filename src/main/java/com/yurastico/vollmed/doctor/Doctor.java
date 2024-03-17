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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    @Embedded
    private Address address;

    public Doctor(DoctorCreateData data) {
        this.name = data.name();
        this.email = data.email();
        this.crm = data.crm();
        this.specialization = data.specialization();
        this.address = new Address(data.address());
    }
}
