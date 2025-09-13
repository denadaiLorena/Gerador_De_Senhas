package com.lorena.gerador_senhas.service;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.lorena.gerador_senhas.dto.PasswordRequest;

@Service
public class PasswordService {
    private final Random random = new Random();

    public String gerarSenha(PasswordRequest request){
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "0123456789";
        String simbolos = "!@#$%¨&*()-_=+[]{}";
        StringBuilder caracteres = new StringBuilder();

        if(request.isMaiusculas()){
            caracteres.append(letrasMaiusculas);
        }
        if(request.isMinusculas()){
            caracteres.append(letrasMinusculas);
        }
        if(request.isDigitos()){
            caracteres.append(digitos);
        }
        if(request.isSimbolos()){
            caracteres.append(simbolos);
        }

        if (request.getTamanho() == 0){
            return "Por favor, defina um tamanho válido.";
        }
        
        if(caracteres.isEmpty() || request.getTamanho() <= 0){
            return "";
        }

        StringBuilder senha = new StringBuilder();
        for(int i = 0; i < request.getTamanho(); i++){
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        return senha.toString();
    }
}
