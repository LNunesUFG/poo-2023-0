package main.java.com.ufg.lucas.t13.Classes;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private List<Produto> produtos;
    private Cliente cliente;
    private double valorTotal;

    public Orcamento() {
        this.produtos = new ArrayList<>();
    }

    protected void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void realizarVenda() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos no orçamento para realizar a venda.");
            return;
        }
    
        if (cliente == null) {
            System.out.println("Não foi definido um cliente para realizar a venda.");
            return;
        }
    
        double valorVenda = 0.0;
        for (Produto produto : produtos) {
            valorVenda += produto.getPreco() * produto.getQuantidade();
        }
    
        setValorTotal(valorVenda);
    
        System.out.println("Venda realizada com sucesso!");
    }

    public void adicionarProdutosVenda(String nome, double quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        addProduto(produto);
    }

    public void adicionarClienteVenda(String nome, String cpfCnpj) {
        Cliente cliente = new Cliente(nome, cpfCnpj);
        setCliente(cliente); 
    }
    
    public void listarProdutosParaVenda() {
        System.out.println("Produtos disponíveis para venda:");
    
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("-----------------------");
        }
    }
    


}
