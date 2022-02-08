package ClassesAbstratas;



public class Conta implements Pix{
	
	
	private int numero;
	protected double saldo; // protected serve para que o atributo em questão só seja ultilizado pelas classes filhas (subclasses) e classes do mesmo packeg.
	private Cliente titular; // atributo/objeto, um objeto pode ter como atributo outro objeto.
	private static int numeroDeContas; // static serve para que um atributo seja pertencente à classe e não à um objeto
	
	
	
	public Conta(Cliente titular, int numero, double saldo) /* toda vez que um objeto é instanciado, ele roda o construtor */ { 
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		Conta.numeroDeContas +=1; // para invocar o atributo da classe, usa-se o nome da classe ao invez do this.
	}

	
	public static int getNumeroDeContas() /* Para metodos da classe, usase o static */{
		return Conta.numeroDeContas;
	}

	 
	public Cliente getTitular() /* metodo get para acessar o atributo/objeto*/{
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
	
	
	public void trasnfere(double valor, Conta destino) /* um pode acionar n objetos*/{

		if (valor > saldo) {
			System.out.println("valor não pode ser transferido pois é superior ao saldo");
		}
		else {
			
			this.saldo -= valor;
			destino.credito(valor);
			//destino2.credito(valor);
			
		}
		
	}


	@Override
	public void transferePix(String chave, Conta destino, double valor) {
		
		if (chave == titular.getCpf()) {
			destino.trasnfere(valor, destino);
		}
	}
	
	
	
}

		
		
		
		
	

