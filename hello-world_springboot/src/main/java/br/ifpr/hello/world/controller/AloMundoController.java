package br.ifpr.hello.world.controller;

import org.springframework.web.bind.annotation.*;

@RestController // Diz que a classe é um controlador
@RequestMapping("/") // Diz que trabalhamos com uma classe de requisição
public class AloMundoController {
    
    @GetMapping("/get")
    public String aloMundoString(){
        return "Hello World";
    }

}
