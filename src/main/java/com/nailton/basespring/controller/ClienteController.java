package com.nailton.basespring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nailton.basespring.model.entity.Cliente;
import com.nailton.basespring.service.ClienteService;


@RestController
@RequestMapping("clientes")
public class ClienteController {

   
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(final @RequestBody Cliente cliente ) {
        return new ResponseEntity<Cliente>(this.clienteService.salvarCliente(cliente), HttpStatus.CREATED);
    }
 

}
