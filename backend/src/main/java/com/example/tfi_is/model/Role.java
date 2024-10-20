package com.example.tfi_is.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum Role {

    MEDIC(Set.of(
            Permission.MEDIC_READ,
            Permission.MEDIC_WRITE,
            Permission.MEDIC_DELETE,
            Permission.MEDIC_UPDATE
    )),

    RECEPTIONIST(Set.of(
            Permission.RECEPTIONIST_READ,
            Permission.RECEPTIONIST_WRITE,
            Permission.RECEPTIONIST_DELETE,
            Permission.RECEPTIONIST_UPDATE
    )),
    ADMIN(Set.of(
            Permission.MEDIC_READ,
            Permission.MEDIC_WRITE,
            Permission.MEDIC_DELETE,
            Permission.MEDIC_UPDATE,

            Permission.RECEPTIONIST_READ,
            Permission.RECEPTIONIST_WRITE,
            Permission.RECEPTIONIST_DELETE,
            Permission.RECEPTIONIST_UPDATE,

            Permission.ADMIN_READ,
            Permission.ADMIN_WRITE,
            Permission.ADMIN_DELETE,
            Permission.ADMIN_UPDATE
    ));

    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
