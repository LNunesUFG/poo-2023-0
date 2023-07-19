package com.ufg.poo.t10;

public class Oficina {
    private String nome;
    private Endereco endereco;
    private String telefone;
    
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
	
	@Override
	public String toString() {
		return "Oficina [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
}
