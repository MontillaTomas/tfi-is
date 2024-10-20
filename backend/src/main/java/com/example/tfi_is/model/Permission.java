package com.example.tfi_is.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {
    ADMIN_READ("admin:read"),
    ADMIN_WRITE("admin:write"),
    ADMIN_DELETE("admin:delete"),
    ADMIN_UPDATE("admin:update"),

    MEDIC_READ("medic:read"),
    MEDIC_WRITE("medic:write"),
    MEDIC_DELETE("medic:delete"),
    MEDIC_UPDATE("medic:update"),

    RECEPTIONIST_READ("receptionist:read"),
    RECEPTIONIST_WRITE("receptionist:write"),
    RECEPTIONIST_DELETE("receptionist:delete"),
    RECEPTIONIST_UPDATE("receptionist:update");

    private final String permission;
}
