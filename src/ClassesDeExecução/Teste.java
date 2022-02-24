package ClassesDeExecução;

import java.util.ArrayList;


import ClassesAbstratas.Neuronio;

class Teste {
	public	static	void	main(String[]	args) {
		
		ArrayList<Neuronio> sistema = new ArrayList<>();
		
		for (int i = 0; i<10; i++ ) {
			new Neuronio(i);
			System.out.println();
		}

	}

}
