package com.yurastico.vollmed.domain.patient;

import com.yurastico.vollmed.domain.address.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "patients")
@Entity(name = "Patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private Address address;

}
