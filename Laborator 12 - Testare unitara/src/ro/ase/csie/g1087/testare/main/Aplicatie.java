package ro.ase.csie.g1087.testare.main;

import ro.ase.csie.g1087.testare.modelele.OperatiiMatematice;

public class Aplicatie {

	public static void main(String[] args) {
		
		
		System.out.println("Hello. Aplicatia a pornit");
		
		int a = 5;
		int b = 5;
		int rezultatAstepta = 10;
		int rezultatCalculat = OperatiiMatematice.aduna(a, b);
		
		
		if(rezultatAstepta==rezultatCalculat)
		{
			System.out.println("Metoda Aduna este okay");
			
		}
		
		else
		{
			System.out.println("Ne mai trebuie niste cursuri de mate");
		
		}
	}

}
