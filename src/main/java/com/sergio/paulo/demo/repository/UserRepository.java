package com.sergio.paulo.demo.repository;

import com.sergio.paulo.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
