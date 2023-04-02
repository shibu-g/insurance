package com.insurance.insurance.Repositories;

import com.insurance.insurance.Entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy,Integer> {
}
