package com.lorena.gerador_senhas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lorena.gerador_senhas.dto.PasswordRequest;
import com.lorena.gerador_senhas.service.PasswordService;

@RestController
@RequestMapping("/api/senhas")
@CrossOrigin(origins = "*")


public class PasswordController {

    private final  PasswordService passwordService;

    @Autowired
    public PasswordController(PasswordService passwordService){
        this.passwordService = passwordService;
    }

    @PostMapping("/gerar")
    public String gerarSenha(@RequestBody PasswordRequest request){
        return passwordService.gerarSenha(request);
    }
}
