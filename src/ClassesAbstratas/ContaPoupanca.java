package ClassesAbstratas;

public class ContaPoupanca extends Conta{
	
	private double saldoPoupanca;
	

	public ContaPoupanca(Cliente titular, int numero, double saldo, double saldoPoupanca) {
		super(titular, numero, saldo);
		this.saldoPoupanca= saldoPoupanca;
		
	}


	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}


	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public void depositaPoupanca (double valor) {
		this.saldoPoupanca+=valor;
	}
	
	public void transferePoupancaSaldo(double valor) {
		this.saldo += valor;
		this.saldoPoupanca-= valor;
	}
	
	public void transfereSaldoPoupanca(double valor) {
		this.saldo -= valor;
		this.saldoPoupanca+= valor;
	}
	

}
