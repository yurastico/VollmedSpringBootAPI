package com.yurastico.vollmed.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String neighborhood;
    private String zipCode;
    private String number;
    private String complement;
    private String city;
    private String state;

    public Address(AddressData address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.state = address.state();
        this.city = address.city();
        this.number = address.number();
        this.complement = address.complement();
        this.zipCode = address.zipCode();
    }

    public void updateAddress(AddressData data) {
        if (data.street() != null) {
            this.street = data.street();
        }
        if (data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }
        if (data.zipCode() != null) {
            this.zipCode = data.zipCode();
        }
        if (data.city() != null) {
            this.city = data.city();
        }
        if (data.complement() != null) {
            this.complement = data.complement();
        }
        if (data.number() != null) {
            this.number = data.number();
        }
        if (data.state() != null) {
            this.state = data.state();
        }
    }
}
