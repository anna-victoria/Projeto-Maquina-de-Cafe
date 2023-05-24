package br.upe.reforco;

public class PedidoCafe {
	
	public double prepararBebida(double credito) {
		
		// rotina para ligar a maquina
		//validar agua
		//validar moedor
		//validar dosador
		//validar aquecedor
		
		// rotina receber dinheiro
		
		// rotina pedir bebida
		
		
		return 0;
	}
	public static void main(String[] args) {
		
		Maquina maquina = new Maquina();
		
		if (maquina.maquinaOk()) {
			System.out.println("Máquina funcionando");
			
			maquina.depositarCredito(1.0);
			
			maquina.preparaBebida(1);
		} else {
			System.out.println("Máquina fora de serviço");
		}
		//checar a maquina
		
		//receber dinheiro
		
		//preparar bebida

	}

}
