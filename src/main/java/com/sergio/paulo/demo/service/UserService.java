package com.sergio.paulo.demo.service;

import com.sergio.paulo.demo.Entity.User;
import com.sergio.paulo.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User criarUsuario(User user) {
        return userRepository.save(user);
    }

    public User obterUsuarioPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User atualizarUsuario(User user) {
        return userRepository.save(user);
    }

    public List<User> listarUsuario(Long id) {
        return userRepository.findAll();
    }

    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }
}
