package com.ufg.poo;

import com.ufg.poo.t13.classes.Orcamento;

public class App 
{
    public static void main( String[] args )
    {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarClienteVenda("Lucas", "707.070.707-77");
        orcamento.adicionarProdutosVenda("Cimento", 1, 35.00);
        orcamento.adicionarProdutosVenda("Areia", 1.5, 60.00);
        orcamento.adicionarProdutosVenda("Brita", 1, 55.00);

        orcamento.listarProdutosParaVenda();
        
    }
}
