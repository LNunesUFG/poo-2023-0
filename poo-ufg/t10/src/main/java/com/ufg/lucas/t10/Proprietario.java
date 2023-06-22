package main.java.com.ufg.lucas.t10;

public class Proprietario {
	private String nome;
    private Oficina empreendimento;
    private int idade;
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Oficina getEmpreendimento() {
		return empreendimento;
	}
	public void setEmpreendimento(Oficina empreendimento) {
		this.empreendimento = empreendimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", empreendimento=" + empreendimento + ", idade=" + idade + "]";
	}
}
