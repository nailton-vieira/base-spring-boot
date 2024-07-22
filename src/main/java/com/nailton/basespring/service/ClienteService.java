package com.nailton.basespring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nailton.basespring.model.entity.Cliente;
import com.nailton.basespring.repository.ClienteRepository;



@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente objCliente) {
        return this.clienteRepository.save(objCliente);
       

}

    
    

}
