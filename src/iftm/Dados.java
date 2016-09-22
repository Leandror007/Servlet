package iftm;

public class Dados {
	int chave;
	String nome;
	String telefone;
	

	public Dados(int chave, String nome, String telefone) {
		super();
		this.chave = chave;
		this.nome = nome;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}



}
