package br.ufg.inf.t10;

public class Percurso {
    private String descricao;
    private String nome;
    private double distancia;
    private char dificuldade;
    
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public char getDificuldade() {
		return dificuldade;
	}
	
	public void setDificuldade(char dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	@Override
	public String toString() {
		return "Percurso [descricao=" + descricao + ", nome=" + nome + ", distancia=" + distancia + ", dificuldade="
				+ dificuldade + "]";
	}
}
