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
}
