package com.sergio.paulo.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "Nome é obrigatório!")
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @NotNull(message = "Email é obrigatório!")
    @Column(name = "email", length = 250, nullable = false)
    private String email;
}
