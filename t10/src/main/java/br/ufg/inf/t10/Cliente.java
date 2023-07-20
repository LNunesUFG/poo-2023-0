package br.ufg.inf.t10;

import java.util.List;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private int idade;
    private List<Bicicleta> bikes;

    public void arrumarBicicleta() {
    }
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Bicicleta> getBikes() {
		return bikes;
	}
	
	public void setBikes(List<Bicicleta> bikes) {
		this.bikes = bikes;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", idade=" + idade
				+ ", bikes=" + bikes + "]";
	}  
}
