package com.yurastico.vollmed.doctor;

import com.yurastico.vollmed.address.AddressData;

public record DoctorCreateData(String name, String email, String crm, Specialization specialization, AddressData address) {
}
