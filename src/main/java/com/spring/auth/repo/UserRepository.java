package com.spring.auth.repo;

import com.spring.auth.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Userentity, Long> {

    Optional<Userentity> findByEmail(String email);
}
