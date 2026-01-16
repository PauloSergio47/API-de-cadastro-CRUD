package com.sergio.paulo.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "Users", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "Nome é obrigatório!")
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @NotNull(message = "Email é obrigatório!")
    @Column(name = "email", length = 250, nullable = false)
    private String email;
}
