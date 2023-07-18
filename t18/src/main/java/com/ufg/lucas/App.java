package com.ufg.lucas;

import com.ufg.lucas.t18.xadrez.Partida;

public class App {
    public static void main( String[] args ) {
        Partida partida = new Partida();
        Partida partidaImortal = partida.criarPartidaImortal();
        System.out.println(partidaImortal.toString());
    }
}
