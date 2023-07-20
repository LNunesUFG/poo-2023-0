package br.ufg.inf.t10;

public class Seguranca {
    private Boolean capacete;
    private Boolean coleteRefletivo;
    private Boolean sinalizacao;
    private Boolean faroletes;
    private Boolean freios;
    
	public Boolean usaCapacete() {
		return capacete;
	}

	public void setCapacete(Boolean capacete) {
		this.capacete = capacete;
	}

	public Boolean usaColeteRefletivo() {
		return coleteRefletivo;
	}

	public void setColeteRefletivo(Boolean coleteRefletivo) {
		this.coleteRefletivo = coleteRefletivo;
	}

	public Boolean usaSinalizacao() {
		return sinalizacao;
	}

	public void setSinalizacao(Boolean sinalizacao) {
		this.sinalizacao = sinalizacao;
	}

	public Boolean usaFaroletes() {
		return faroletes;
	}

	public void setFaroletes(Boolean faroletes) {
		this.faroletes = faroletes;
	}

	public Boolean usaFreios() {
		return freios;
	}

	public void setFreios(Boolean freios) {
		this.freios = freios;
	}
	
	@Override
	public String toString() {
		return "Seguranca [capacete=" + capacete + ", coleteRefletivo=" + coleteRefletivo + ", sinalizacao="
				+ sinalizacao + ", faroletes=" + faroletes + ", freios=" + freios + "]";
	}
}
