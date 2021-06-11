package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@controller faz o gerenciamento da classe
@Controller
public class HelloController {

    //@RequesMapping é para dizer ao spring quando ele deve chamar o método abaixo
    @RequestMapping("/")
    //@ResponseBody indica para o spring que o retorno do método deve ser devolvido como resposta
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
