package br.ufg.inf.t07.interfacepoo;

public class Prova implements Identificacao {

    private byte numQuestoes;

    @Override
    public String getNome() {
        return null;
    }

    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(byte numQuestoes) {
        this.numQuestoes = numQuestoes;
    }
}
