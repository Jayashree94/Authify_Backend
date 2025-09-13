package com.spring.auth.repo;

import com.spring.auth.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserRepository, Long> {

    Optional<Userentity> findByEmail(String email);
}
