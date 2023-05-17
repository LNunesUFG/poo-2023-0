package com.ufg.lucas.t07;

import java.util.ArrayList;

public class Uniao {
    private ArrayList filhos;
    private PessoaComAtributos[] parceiros;

    public void novoFilho(PessoaComAtributos p) {
        filhos.add(p);
    }

    public Uniao(PessoaComAtributos a, PessoaComAtributos b) {
        parceiros[0] = a;
        parceiros[1] = b;
    }
}
