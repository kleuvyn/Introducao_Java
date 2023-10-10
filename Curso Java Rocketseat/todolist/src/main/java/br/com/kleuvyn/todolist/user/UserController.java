package br.com.kleuvyn.todolist.user;

import br.com.kleuvyn.todolist.user.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
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
public class UserController {
    @PostMapping("/")
    public void create (@RequestBody UserModel userModel) {
        System.out.println(userModel.name);

    }


}
