package com.yurastico.vollmed.doctor;

import com.yurastico.vollmed.address.AddressData;
import jakarta.validation.constraints.NotNull;

public record DoctorUpdateData(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressData address) {
}
