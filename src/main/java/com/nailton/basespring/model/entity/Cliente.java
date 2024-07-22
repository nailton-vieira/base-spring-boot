package com.nailton.basespring.model.entity;

import com.nailton.basespring.model.dto.ClienteDto;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "cliente_tb")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;
    
   /* @Enumerated(EnumType.STRING)
    private String sexo;

    @Embedded
    private Endereco endereco;

     public Cliente(ClienteDto dados) {
      
        this.nome = dados.nome();
        this.email = dados.email();
       // this.sexo = dados.sexo();
       // this.endereco = new Endereco(dados.endereco());
    }
    */
    

    

    
}

