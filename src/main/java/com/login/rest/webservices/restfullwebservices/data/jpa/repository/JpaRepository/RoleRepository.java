package com.login.rest.webservices.restfullwebservices.data.jpa.repository.JpaRepository;

import com.login.rest.webservices.restfullwebservices.userlogin.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(String name);
}