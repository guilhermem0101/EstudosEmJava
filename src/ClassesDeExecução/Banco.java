package ClassesDeExecução;

import ClassesAbstratas.Cliente;
import ClassesAbstratas.Conta;

public class Banco {
	
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente("guilherme","65465", 24);
		Cliente cliente2 = new Cliente("julio","14598", 21);
		Cliente cliente3 = new Cliente("andre","68733", 19);
				
		Conta conta1 = new Conta(cliente1 ,1,4000.00);		
		Conta conta2 = new Conta(cliente2,2,3000.00);
		Conta conta3 = new Conta(cliente3,3,3000.00);
		
		
		//conta1.trasnfere(1000, conta2, conta3);
		System.out.println(conta2.getSaldo()+ " "+ conta3.getSaldo() );
		
		System.out.println(conta1.titular.nome);
	}

}
