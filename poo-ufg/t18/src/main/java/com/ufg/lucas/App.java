package com.ufg.lucas;

import com.ufg.lucas.t18.xadrez.Jogador;
import com.ufg.lucas.t18.xadrez.Lance;
import com.ufg.lucas.t18.xadrez.Partida;
import com.ufg.lucas.t18.xadrez.Peca;
import com.ufg.lucas.t18.xadrez.Posicao;

public class App 
{
    public static void main( String[] args )
    {
        Partida partida = new Partida();
        Jogador adolf = new Jogador("Adolf Anderssen"); //brancas
        Jogador lionel = new Jogador("Lionel Kieseritzky"); //pretas

        /*Inicio dos lances */
        Peca peao = new Peca("Peão");
        Posicao pos1I = new Posicao(5, 2);
        Posicao pos1F = new Posicao(5, 4);
        Lance lance1 = new Lance(adolf, peao, pos1I, pos1F);
        partida.registrarLance(lance1);

        Posicao pos2I = new Posicao(5, 7);
        Posicao pos2F = new Posicao(5, 5);
        Lance lance2 = new Lance(lionel, peao, pos2I, pos2F);
        partida.registrarLance(lance2);

        System.out.println(partida.toString());

        
    }
}
