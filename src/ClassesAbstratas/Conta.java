package ClassesAbstratas;



public class Conta {
	
	
	int numero;
	double saldo;
	public Cliente titular;
	
	
	
	
	public Conta(Cliente titular, int numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}




	public Cliente getTitular() {
		return titular;
	}




	public void setTitular(Cliente titular) {
		this.titular = titular;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}



	
	//metodos

	public void debito (double valor) {
		
		if (valor > saldo) {
			System.out.println("valor n�o pode ser sacado pois � superior ao saldo");
		}
		else {
			this.saldo -= valor;
		}
		
	}
	
	public void credito (double valor) {
		
		this.saldo += valor;
	}
	
	
	public void trasnfere(double valor, Conta destino, Conta destino2) {

		if (valor > saldo) {
			System.out.println("valor n�o pode ser transferido pois � superior ao saldo");
		}
		else {
			
			this.saldo -= valor;
			destino.credito(valor);
			destino2.credito(valor);
			
		}
		
	}
	
	
	
}

		
		
		
		
	

