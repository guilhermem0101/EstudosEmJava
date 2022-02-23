package ClassesDeExecução;

import java.util.ArrayList;

import ClassesAbstratas.Cliente;
import ClassesAbstratas.Conta;
import ClassesAbstratas.ContaPoupanca;

public class Banco {
	
	public static void main (String[] args) {
		metodo1();
		ArrayList	contass	=	new	ArrayList();
		ArrayList<Conta> contas = new ArrayList<>();
		Cliente cliente1 = new Cliente("guilherme","65465", 24);
		Cliente cliente2 = new Cliente("julio","14598", 21);
		Cliente cliente3 = new Cliente("andre","68733", 19);
				
		Conta conta1 = new Conta(cliente1 ,1,4000.00);		
		Conta conta2 = new Conta(cliente2,2,3000.00);
		Conta conta3 = new Conta(cliente3,3,3000.00);
		ContaPoupanca conta4 = new ContaPoupanca(cliente3, 4, 2000.00, 1000.00);
		
		
		
		contas.add(conta1);
		contas.add(conta2);
		//conta1.debito(5000);
		//conta1.trasnfere(1000, conta2, conta3);
		conta4.transferePoupancaSaldo(2000.00);
		
		
		/*try	{
			for	(int	i	=	0;	i	<=	15;	i++)	{
				conta1.credito(	1000);
				System.out.println(conta1.getSaldo());
				if	(i	==	5)	{
					conta1 =	null;
				}
			}
		}	catch	(NullPointerException	e)	{
			System.out.println("erro:	"	+	e);
		}*/
		//System.out.println(conta4.getSaldo()+ " "+ conta4.getSaldoPoupanca());
		
		//System.out.println(conta1.getTitular().getNome() + " " + Conta.getNumeroDeContas());
	}
	public static void metodo1() {
		System.out.println("inicio do metodo1");
		try	{
		metodo2();
		}catch	(NullPointerException	e)	{
			System.out.println("erro:	"	+	e);
		}
		System.out.println("fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("inicio	do	metodo2");
		Cliente cliente1 = new Cliente("guilherme","65465", 24);
		Conta conta1 = new Conta(cliente1 ,1,4000.00);
		
		
		for	(int	i	=	0;	i	<=	15;	i++){
						
			conta1.credito(i	+	1000);
			System.out.println(conta1.getSaldo());
			if	(i	==	5){
							conta1	=	null;
			}
		
		}
		
		System.out.println("fim	do	metodo2");
	}
	
	
	
	

}
