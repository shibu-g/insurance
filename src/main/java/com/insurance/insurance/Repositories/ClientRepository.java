package com.insurance.insurance.Repositories;

import com.insurance.insurance.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}
