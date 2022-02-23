package ClassesDeExecução;

import java.io.FileNotFoundException;
import java.util.Random;

import ClassesAbstratas.Conta;

class Teste {
	public	static	void	main(String[]	args) {
		try {
			new	java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
