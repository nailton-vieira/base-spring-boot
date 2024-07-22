package com.nailton.basespring.model.entity;
/*
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "endereco_db")
@Embeddable
@Data */
public class Endereco {

    private Long Id;
    private String logradoro;
    private String bairro;

    
}
