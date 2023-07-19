package com.ufg.poo.t18.xadrez;

public class Lance {
    private Jogador jogadorDaVez;
    private Peca pecaMexida;
    private Posicao posicaoInicial;
    private Posicao posicaoFinal;

    public Lance(Jogador jogadorDaVez, Peca pecaMexida, Posicao posicaoInicial, Posicao posicaoFinal) {
        this.jogadorDaVez = jogadorDaVez;
        this.pecaMexida = pecaMexida;
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posicaoFinal;
    }

    public Jogador getJogadorDaVez() {
        return jogadorDaVez;
    }

    public Peca getPecaMexida() {
        return pecaMexida;
    }

    public Posicao getPosicaoInicial() {
        return posicaoInicial;
    }

    public Posicao getPosicaoFinal() {
        return posicaoFinal;
    }

    @Override
    public String toString() {
        return jogadorDaVez.getNome() + " moveu " + pecaMexida.getNome() + " de " +
                posicaoInicial + " para " + posicaoFinal;
    }
}
