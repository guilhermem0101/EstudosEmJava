package ClassesDeExecução;

import ClassesAbstratas.Cliente;
import ClassesAbstratas.Conta;
import ClassesAbstratas.ContaPoupanca;

public class Banco {
	
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente("guilherme","65465", 24);
		Cliente cliente2 = new Cliente("julio","14598", 21);
		Cliente cliente3 = new Cliente("andre","68733", 19);
				
		Conta conta1 = new Conta(cliente1 ,1,4000.00);		
		Conta conta2 = new Conta(cliente2,2,3000.00);
		Conta conta3 = new Conta(cliente3,3,3000.00);
		ContaPoupanca conta4 = new ContaPoupanca(cliente3, 4, 2000.00, 1000.00);
		
		//conta1.trasnfere(1000, conta2, conta3);
		conta4.transferePoupancaSaldo(2000.00);
		
		
		System.out.println(conta4.getSaldo()+ " "+ conta4.getSaldoPoupanca());
		
		System.out.println(conta1.getTitular().getNome() + " " + Conta.getNumeroDeContas());
	}

}
