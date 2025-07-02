package com.example.usermanagementapi.Repository;

import com.example.usermanagementapi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);


    List<User> findByNameContainingIgnoreCase(String name);
}