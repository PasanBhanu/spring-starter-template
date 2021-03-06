package com.softinklab.authentication.database.repository;

import com.softinklab.authentication.database.model.AutUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AutUser, Integer> {
    Optional<AutUser> findByUsernameEqualsIgnoreCase(String username);

    Optional<AutUser> findByConfirmationToken(String token);
}
