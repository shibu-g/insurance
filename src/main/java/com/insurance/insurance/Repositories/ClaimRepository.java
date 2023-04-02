package com.insurance.insurance.Repositories;

import com.insurance.insurance.Entity.Claims;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claims,Integer> {
}
