package com.nailton.basespring.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nailton.basespring.model.dto.ClienteDto;
import com.nailton.basespring.model.entity.Cliente;
import com.nailton.basespring.repository.ClientRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("cadclientes")
public class ClienteController {

    private ClientRepository clientRepository;

    @PostMapping
    @Transactional
    public void cadastrarCliente(@RequestBody @Valid ClienteDto dados) {
        clientRepository.save(new Cliente(dados));

    }




    
    
}
