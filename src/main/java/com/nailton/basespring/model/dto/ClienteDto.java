package com.nailton.basespring.model.dto;

import com.nailton.basespring.model.entity.Sexo;

public record ClienteDto(String nome, String email, Sexo sexo, EnderecoDto endereco) {

}
