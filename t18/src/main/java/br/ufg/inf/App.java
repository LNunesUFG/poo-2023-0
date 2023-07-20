package br.ufg.inf;

import br.ufg.inf.t18.xadrez.Partida;
import br.ufg.inf.t18.xadrez.PartidasFactory;

public class App {
    public static void main( String[] args ) {
        Partida partida = new Partida();
        partida = PartidasFactory.partidaImortal();
        System.out.println(partida.toString());
    }
}
