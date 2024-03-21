package com.yurastico.vollmed.domain.doctor;

import com.yurastico.vollmed.domain.address.AddressData;
import jakarta.validation.constraints.NotNull;

public record DoctorUpdateData(
        @NotNull
        Long id,
        String name,
        String phone,
        AddressData address) {
}
