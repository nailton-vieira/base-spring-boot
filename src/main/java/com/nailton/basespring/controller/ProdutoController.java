package com.nailton.basespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nailton.basespring.model.entity.Produto;
import com.nailton.basespring.repository.Produtoepository;

@RestController
public class ProdutoController {

    @Autowired
    private Produtoepository produtoepository;

    @PostMapping("/produtos")
    public Produto cadastrarProduto(@RequestBody Produto objProduto){
            return produtoepository.save(objProduto);
            

        //return produtoepository.save(objProduto);
    }


    
}
