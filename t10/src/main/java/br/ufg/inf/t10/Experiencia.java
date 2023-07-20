package br.ufg.inf.t10;

public class Experiencia {
    private String descricao;
    private Percurso corrida;
    private Seguranca seguranca;
    
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Percurso getCorrida() {
		return corrida;
	}

	public void setCorrida(Percurso corrida) {
		this.corrida = corrida;
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Seguranca seguranca) {
		this.seguranca = seguranca;
	}
	
	@Override
	public String toString() {
		return "Experiencia [descricao=" + descricao + ", corrida=" + corrida + ", seguranca=" + seguranca + "]";
	}
}
