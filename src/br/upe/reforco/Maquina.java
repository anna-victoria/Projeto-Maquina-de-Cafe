package br.upe.reforco;

import java.util.Random;

public class Maquina {
	
	Random rand = new Random();

	//ingredientes
	double cafe;
	double leite;
	double chocolate;
	double agua;
	
	//creditos
	private double credito;
	
	//status
	private boolean statusMoedor = true;
	private boolean statusBombaAgua = true;
	private boolean statusAquecedor = true;
	private boolean statusDosador = true;
	private boolean statusDispensadorCopo = true;
	
	private Receita espresso;		
	private Receita longo;		
	private Receita pingado;
	private Receita cappuccino;
	private Receita capchoc;
	private Receita cafechocolate;
	private Receita bebidachocolate;
	private Receita chocolateleite;
	
	public Maquina() {
		this.statusMoedor = rand.nextInt(10) > 0;
		this.statusBombaAgua = rand.nextInt(10) > 0;
		this.statusAquecedor = rand.nextInt(10) > 0;
		this.statusDosador = rand.nextInt(10) > 0;
		this.statusDispensadorCopo = rand.nextInt(10) > 0;
		
		this.espresso = new Receita("Café Espresso", 40, 40, 0, 0, 0.50);		
		this.longo = new Receita("Café Longo", 80, 40, 0, 0, 0.50);		
		this.pingado = new Receita("Café Pingado", 40, 20, 40, 0, 1);
		this.cappuccino = new Receita("Cappuccino", 80, 40, 80, 0, 1.50);
		this.cafechocolate = new Receita("Café com Chocolate", 80, 40, 0, 40, 1.50);
		this.bebidachocolate = new Receita("Chocolate", 40, 0, 0, 40, 1);
		this.chocolateleite = new Receita("Chocolate com Leite", 40, 0, 40, 40, 1.75);
		
	}
	
	public boolean maquinaOk() {
		
		boolean status = this.statusAquecedor && this.statusBombaAgua && this.statusDispensadorCopo && this.statusDosador
				&& this.statusMoedor;
		return status;
	}
	
	public void depositarCredito(double valorDepositado) {
		double novoCredito = this.credito + valorDepositado;
		this.credito = novoCredito;
	}

	public void preparaBebida(int opcaoBebida) {
		// encontrar a receita
		Receita receita = null;
		if(opcaoBebida == 1) {
			receita = this.espresso;
		} else if(opcaoBebida == 2) {
			receita = this.longo;
		} else if(opcaoBebida == 3) {
			receita = this.pingado;
		} else if(opcaoBebida == 4) {
			receita = this.cappuccino;
		} else if(opcaoBebida == 5) {
			receita = this.capchoc;
		} else if(opcaoBebida == 6) {
			receita = this.cafechocolate;
		} else if(opcaoBebida == 7 ) {
			receita = this.bebidachocolate;
		} else if(opcaoBebida == 8) {
			receita = this.chocolateleite;
		}
		
		// preparar a bebida
		
		System.out.println("Preparando sua bebida!");
		// debitar o credito
	
		this.credito = this.credito - receita.getPreco();
		
		// informar que a preparação terminou
		
		System.out.println("Preparação terminada");
		
	}
}
