package com.nailton.basespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nailton.basespring.model.entity.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long> {
   
    
}
