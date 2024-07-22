package com.nailton.basespring.service;

import org.springframework.stereotype.Service;

import com.nailton.basespring.model.entity.Cliente;
import com.nailton.basespring.repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
       

}

}
