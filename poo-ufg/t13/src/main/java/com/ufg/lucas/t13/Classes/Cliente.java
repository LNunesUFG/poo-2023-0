package com.ufg.lucas.t13.classes;

public class Cliente {
    private String nome;
    private String cpfCnpj;

    public Cliente(String nome, String cpfCnpj) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }   

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

}
