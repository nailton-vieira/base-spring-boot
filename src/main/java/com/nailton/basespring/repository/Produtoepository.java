package com.nailton.basespring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nailton.basespring.model.entity.Produto;

@Repository
public interface Produtoepository extends JpaRepository<Produto,Long> {
   
    List<Produto> findAll();
      
        
    
}
