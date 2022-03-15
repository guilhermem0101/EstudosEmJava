package ClassesDeExecução;

import java.util.ArrayList;


import ClassesAbstratas.Neuronio;

class Teste {
	public	static	void	main(String[]	args) {
		
		ArrayList<Neuronio> sistema = new ArrayList<>();
		
		for (int i = 0; i<10; i++ ) {
			Neuronio n = new Neuronio(i);
			System.out.println();
			sistema.add(i, n);
		}
		
		for(Neuronio item : sistema){
            System.out.print(item.getId());
            System.out.println();
        }
		

	}

}
