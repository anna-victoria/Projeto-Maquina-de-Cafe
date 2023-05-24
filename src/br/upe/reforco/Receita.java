package br.upe.reforco;

public class Receita {

	private double qtdCafe;
	private double qtdLeite;
	private double qtdAgua;
	private double qtdChocolate;
	private String nome;

	private double preco;

	public Receita(String nome, double qtdAgua, double qtdCafe, double qtdLeite, double qtdChocolate, double preco) {
		this.nome = nome;
		this.qtdAgua = qtdAgua;
		this.qtdCafe = qtdCafe;
		this.qtdLeite = qtdLeite;
		this.qtdChocolate = qtdChocolate;
		this.preco = preco;
	}

	// para ver todos os metodos: ctrl + o

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtdCafe() {
		return qtdCafe;
	}

	public double getQtdLeite() {
		return qtdLeite;
	}

	public double getQtdAgua() {
		return qtdAgua;
	}

	public double getQtdChocolate() {
		return qtdChocolate;
	}

	public void setQtdCafe(double qtdCafe) {
		this.qtdCafe = qtdCafe;
	}

	public void setQtdLeite(double qtdLeite) {
		this.qtdLeite = qtdLeite;
	}

	public void setQtdAgua(double qtdAgua) {
		this.qtdAgua = qtdAgua;
	}

	public void setQtdChocolate(double qtdChocolate) {
		this.qtdChocolate = qtdChocolate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
