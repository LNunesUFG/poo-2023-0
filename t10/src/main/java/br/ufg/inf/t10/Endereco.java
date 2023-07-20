package br.ufg.inf.t10;

public class Endereco {
    private String logradouro;
    private String complemento;
    private String cep;
    private int numero;

    public String getLogradouro() {
        return logradouro;
    }

	public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", complemento=" + complemento + ", cep=" + cep + ", numero="
				+ numero + "]";
	}
}