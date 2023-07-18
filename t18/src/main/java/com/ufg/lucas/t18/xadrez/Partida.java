package com.ufg.lucas.t18.xadrez;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Lance> lances;

    public Partida() {
        this.lances = new ArrayList<>();
    }

    public void registrarLance(Lance lance) {
        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lance lance : lances) {
            sb.append(lance).append("\n");
        }
        return sb.toString();
    }

    public Partida criarPartidaImortal() {
        Partida partida = new Partida();
        Jogador adolf = new Jogador("Adolf Anderssen"); //brancas
        Jogador lionel = new Jogador("Lionel Kieseritzky"); //pretas

        /*PEÇAS*/
        Peca peao = new Peca("Peão");
        Peca bispo = new Peca("Bispo");
        Peca rainha = new Peca("Rainha");
        Peca rei = new Peca("Rei");
        Peca cavalo = new Peca("Cavalo");
        Peca torre = new Peca("Torre");

        /*Inicio dos lances */
        Posicao pos1I = new Posicao(5, 2);
        Posicao pos1F = new Posicao(5, 4);
        Lance lance1 = new Lance(adolf, peao, pos1I, pos1F);
        partida.registrarLance(lance1);

        Posicao pos2I = new Posicao(5, 7);
        Posicao pos2F = new Posicao(5, 5);
        Lance lance2 = new Lance(lionel, peao, pos2I, pos2F);
        partida.registrarLance(lance2);

        Posicao pos3I = new Posicao(6, 2);
        Posicao pos3F = new Posicao(6, 4);
        Lance lance3 = new Lance(adolf, peao, pos3I, pos3F);
        partida.registrarLance(lance3);

        Posicao pos4I = new Posicao(5, 5);
        Posicao pos4F = new Posicao(6, 4);
        Lance lance4 = new Lance(lionel, peao, pos4I, pos4F);
        partida.registrarLance(lance4);

        Posicao pos5I = new Posicao(6, 1);
        Posicao pos5F = new Posicao(3, 4);
        Lance lance5 = new Lance(adolf, bispo, pos5I, pos5F);
        partida.registrarLance(lance5);

        Posicao pos6I = new Posicao(4, 8);
        Posicao pos6F = new Posicao(8, 4);
        Lance lance6 = new Lance(lionel, rainha, pos6I, pos6F);
        partida.registrarLance(lance6);

        Posicao pos7I = new Posicao(5, 1);
        Posicao pos7F = new Posicao(6, 1);
        Lance lance7 = new Lance(adolf, rei, pos7I, pos7F);
        partida.registrarLance(lance7);

        Posicao pos8I = new Posicao(2, 7);
        Posicao pos8F = new Posicao(2, 5);
        Lance lance8 = new Lance(lionel, peao, pos8I, pos8F);
        partida.registrarLance(lance8);

        Posicao pos9I = new Posicao(3, 4);
        Posicao pos9F = new Posicao(2, 5);
        Lance lance9 = new Lance(adolf, bispo, pos9I, pos9F);
        partida.registrarLance(lance9);

        Posicao pos10I = new Posicao(7, 8);
        Posicao pos10F = new Posicao(6, 6);
        Lance lance10 = new Lance(lionel, cavalo, pos10I, pos10F);
        partida.registrarLance(lance10);

        Posicao pos11I = new Posicao(7, 1);
        Posicao pos11F = new Posicao(6, 3);
        Lance lance11 = new Lance(adolf, cavalo, pos11I, pos11F);
        partida.registrarLance(lance11);

        Posicao pos12I = new Posicao(8, 4);
        Posicao pos12F = new Posicao(8, 6);
        Lance lance12 = new Lance(lionel, rainha, pos12I, pos12F);
        partida.registrarLance(lance12);

        Posicao pos13I = new Posicao(4, 2);
        Posicao pos13F = new Posicao(4, 3);
        Lance lance13 = new Lance(adolf, peao, pos13I, pos13F);
        partida.registrarLance(lance13);

        Posicao pos14I = new Posicao(6, 6);
        Posicao pos14F = new Posicao(8, 5);
        Lance lance14 = new Lance(lionel, cavalo, pos14I, pos14F);
        partida.registrarLance(lance14);

        Posicao pos15I = new Posicao(6, 3);
        Posicao pos15F = new Posicao(8, 4);
        Lance lance15 = new Lance(adolf, cavalo, pos15I, pos15F);
        partida.registrarLance(lance15);

        Posicao pos16I = new Posicao(8, 6);
        Posicao pos16F = new Posicao(7, 5);
        Lance lance16 = new Lance(lionel, rainha, pos16I, pos16F);
        partida.registrarLance(lance16);

        Posicao pos17I = new Posicao(8, 4);
        Posicao pos17F = new Posicao(6, 5);
        Lance lance17 = new Lance(adolf, cavalo, pos17I, pos17F);
        partida.registrarLance(lance17);

        Posicao pos18I = new Posicao(3, 7);
        Posicao pos18F = new Posicao(3, 6);
        Lance lance18 = new Lance(lionel, peao, pos18I, pos18F);
        partida.registrarLance(lance18);

        Posicao pos19I = new Posicao(7, 2);
        Posicao pos19F = new Posicao(7, 4);
        Lance lance19 = new Lance(adolf, peao, pos19I, pos19F);
        partida.registrarLance(lance19);

        Posicao pos20I = new Posicao(8, 5);
        Posicao pos20F = new Posicao(6, 6);
        Lance lance20 = new Lance(lionel, cavalo, pos20I, pos20F);
        partida.registrarLance(lance20);

        Posicao pos21I = new Posicao(8, 1);
        Posicao pos21F = new Posicao(7, 1);
        Lance lance21 = new Lance(adolf, torre, pos21I, pos21F);
        partida.registrarLance(lance21);

        Posicao pos22I = new Posicao(3, 6);
        Posicao pos22F = new Posicao(2, 5);
        Lance lance22 = new Lance(lionel, peao, pos22I, pos22F);
        partida.registrarLance(lance22);

        Posicao pos23I = new Posicao(8, 2);
        Posicao pos23F = new Posicao(8, 4);
        Lance lance23 = new Lance(adolf, peao, pos23I, pos23F);
        partida.registrarLance(lance23);

        Posicao pos24I = new Posicao(6, 5);
        Posicao pos24F = new Posicao(6, 6);
        Lance lance24 = new Lance(lionel, rainha, pos24I, pos24F);
        partida.registrarLance(lance24);

        Posicao pos25I = new Posicao(8, 4);
        Posicao pos25F = new Posicao(8, 5);
        Lance lance25 = new Lance(adolf, peao, pos25I, pos25F);
        partida.registrarLance(lance25);

        Posicao pos26I = new Posicao(6, 6);
        Posicao pos26F = new Posicao(6, 5);
        Lance lance26 = new Lance(lionel, rainha, pos26I, pos26F);
        partida.registrarLance(lance26);

        Posicao pos27I = new Posicao(4, 1);
        Posicao pos27F = new Posicao(6, 3);
        Lance lance27 = new Lance(adolf, rainha, pos27I, pos27F);
        partida.registrarLance(lance27);

        Posicao pos28I = new Posicao(6, 6);
        Posicao pos28F = new Posicao(7, 8);
        Lance lance28 = new Lance(lionel, cavalo, pos28I, pos28F);
        partida.registrarLance(lance28);

        Posicao pos29I = new Posicao(3, 1);
        Posicao pos29F = new Posicao(6, 4);
        Lance lance29 = new Lance(adolf, bispo, pos29I, pos29F);
        partida.registrarLance(lance29);

        Posicao pos30I = new Posicao(7, 5);
        Posicao pos30F = new Posicao(6, 6);
        Lance lance30 = new Lance(lionel, rainha, pos30I, pos30F);
        partida.registrarLance(lance30);

        Posicao pos31I = new Posicao(2, 1);
        Posicao pos31F = new Posicao(3, 3);
        Lance lance31 = new Lance(adolf, cavalo, pos31I, pos31F);
        partida.registrarLance(lance31);

        Posicao pos32I = new Posicao(6, 8);
        Posicao pos32F = new Posicao(3, 5);
        Lance lance32 = new Lance(lionel, bispo, pos32I, pos32F);
        partida.registrarLance(lance32);

        Posicao pos33I = new Posicao(3, 3);
        Posicao pos33F = new Posicao(4, 5);
        Lance lance33 = new Lance(adolf, cavalo, pos33I, pos33F);
        partida.registrarLance(lance33);

        Posicao pos34I = new Posicao(6, 6);
        Posicao pos34F = new Posicao(2, 2);
        Lance lance34 = new Lance(lionel, rainha, pos34I, pos34F);
        partida.registrarLance(lance34);

        Posicao pos35I = new Posicao(6, 4);
        Posicao pos35F = new Posicao(4, 6);
        Lance lance35 = new Lance(adolf, bispo, pos35I, pos35F);
        partida.registrarLance(lance35);

        Posicao pos36I = new Posicao(3, 5);
        Posicao pos36F = new Posicao(7, 1);
        Lance lance36 = new Lance(lionel, bispo, pos36I, pos36F);
        partida.registrarLance(lance36);

        Posicao pos37I = new Posicao(5, 4);
        Posicao pos37F = new Posicao(5, 5);
        Lance lance37 = new Lance(adolf, peao, pos37I, pos37F);
        partida.registrarLance(lance37);

        Posicao pos38I = new Posicao(2, 2);
        Posicao pos38F = new Posicao(1, 1);
        Lance lance38 = new Lance(lionel, rainha, pos38I, pos38F);
        partida.registrarLance(lance38);

        Posicao pos39I = new Posicao(6, 1);
        Posicao pos39F = new Posicao(5, 2);
        Lance lance39 = new Lance(adolf, rei, pos39I, pos39F);
        partida.registrarLance(lance39);

        Posicao pos40I = new Posicao(2, 8);
        Posicao pos40F = new Posicao(1, 6);
        Lance lance40 = new Lance(lionel, cavalo, pos40I, pos40F);
        partida.registrarLance(lance40);

        Posicao pos41I = new Posicao(6, 5);
        Posicao pos41F = new Posicao(7, 7);
        Lance lance41 = new Lance(adolf, cavalo, pos41I, pos41F);
        partida.registrarLance(lance41);

        Posicao pos42I = new Posicao(5, 8);
        Posicao pos42F = new Posicao(4, 8);
        Lance lance42 = new Lance(lionel, rei, pos42I, pos42F);
        partida.registrarLance(lance42);

        Posicao pos43I = new Posicao(6, 3);
        Posicao pos43F = new Posicao(6, 6);
        Lance lance43 = new Lance(adolf, rainha, pos43I, pos43F);
        partida.registrarLance(lance43);

        Posicao pos44I = new Posicao(7, 8);
        Posicao pos44F = new Posicao(6, 6);
        Lance lance44 = new Lance(lionel, cavalo, pos44I, pos44F);
        partida.registrarLance(lance44);

        Posicao pos45I = new Posicao(4, 6);
        Posicao pos45F = new Posicao(5, 7);
        Lance lance45 = new Lance(adolf, bispo, pos45I, pos45F);
        partida.registrarLance(lance45);

        return partida; 
    }
}
