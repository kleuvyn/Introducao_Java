package br.com.kleuvyn.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
//http://localhost:8080/
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    /**
     * Metodos de acesso HTTP
     * GET- Buscar uma informacao
     * POST- Adicionar um daddo/informacao
     * PUT- Alterar mais de uma dado/informacao
     * DELETE- Remover um dado
     * PATCH- Alterar somente uma parte da informacao/dado
     *
     */
    //Metodo de uma classe uma funcionalidade de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
