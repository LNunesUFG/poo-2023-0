package com.ufg.lucas.t18.xadrez;

public class Peca {
    private String nome;

    public Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}