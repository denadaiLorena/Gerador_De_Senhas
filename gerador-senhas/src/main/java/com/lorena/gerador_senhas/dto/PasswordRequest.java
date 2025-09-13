package com.lorena.gerador_senhas.dto;

public class PasswordRequest {
    private int tamanho;
    private boolean maiusculas;
    private boolean minusculas;
    private boolean digitos;
    private boolean simbolos;


    public PasswordRequest(){
    }


    public PasswordRequest(int tamanho, boolean maiusculas, boolean minusculas, boolean digitos, boolean simbolos) {
        this.tamanho = tamanho;
        this.maiusculas = maiusculas;
        this.minusculas = minusculas;
        this.digitos = digitos;
        this.simbolos = simbolos;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isMaiusculas() {
        return maiusculas;
    }
    public void setMaiusculas(boolean maiusculas) {
        this.maiusculas = maiusculas;
    }
    public boolean isMinusculas() {
        return minusculas;
    }
    public void setMinusculas(boolean minusculas) {
        this.minusculas = minusculas;
    }
    public boolean isDigitos() {
        return digitos;
    }
    public void setDigitos(boolean digitos) {
        this.digitos = digitos;
    }
    public boolean isSimbolos() {
        return simbolos;
    }
    public void setSimbolos(boolean simbolos) {
        this.simbolos = simbolos;
    }


}