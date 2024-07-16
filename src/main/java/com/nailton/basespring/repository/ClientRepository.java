package com.nailton.basespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nailton.basespring.model.entity.Cliente;

public interface ClientRepository extends JpaRepository<Cliente,Long> {
   
    
}
