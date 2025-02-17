package com.nailton.basespring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nailton.basespring.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
   
    List<Cliente> findAll();
      
        
    
}
