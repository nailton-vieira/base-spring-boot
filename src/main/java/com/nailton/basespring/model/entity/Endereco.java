package com.nailton.basespring.model.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco_db")
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {

    
    private String logradoro;
    private String bairro;

    
}
