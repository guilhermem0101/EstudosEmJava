package ClassesAbstratas;



public class Conta {
	
	
	private int numero;
	protected double saldo;
	private Cliente titular;
	private static int numeroDeContas;
	
	
	
	public Conta(Cliente titular, int numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		Conta.numeroDeContas +=1;
	}

	
	public static int getNumeroDeContas() {
		return Conta.numeroDeContas;
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
			System.out.println("valor não pode ser sacado pois é superior ao saldo");
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
			System.out.println("valor não pode ser transferido pois é superior ao saldo");
		}
		else {
			
			this.saldo -= valor;
			destino.credito(valor);
			destino2.credito(valor);
			
		}
		
	}
	
	
	
}

		
		
		
		
	

