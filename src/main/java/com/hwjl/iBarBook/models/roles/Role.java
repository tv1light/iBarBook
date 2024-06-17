package com.hwjl.iBarBook.models.roles;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private ERole name;

    @Override
    public String getAuthority() {
        return name.name();
    }
}
