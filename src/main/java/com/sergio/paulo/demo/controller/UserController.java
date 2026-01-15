package com.sergio.paulo.demo.controller;

import com.sergio.paulo.demo.Entity.User;
import com.sergio.paulo.demo.repository.UserRepository;
import com.sergio.paulo.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> criarUsuario(@RequestBody User user) {
        User novoUsuario = userService.criarUsuario(user);
        return ResponseEntity.ok(novoUsuario);
    }

    @PostMapping
    public ResponseEntity<User> atualizarUsuario(@RequestBody User user) {
        User usuarioAtualizado = userService.criarUsuario(user);
        return ResponseEntity.ok(usuarioAtualizado);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam Long id) {
        userService.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }


}
