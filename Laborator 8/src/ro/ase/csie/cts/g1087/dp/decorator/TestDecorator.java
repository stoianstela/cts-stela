package ro.ase.csie.cts.g1087.dp.decorator;

import ro.ase.csie.cts.g1087.dp.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.g1087.dp.adapter.CaracterFantastic;

public class TestDecorator {

	public static void main(String[] args) {
		CaracterFantastic dragon = new CaracterFantastic("Dragonul albastru", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		
		ACMECaracterJoc dragonCuScut = new DecoratorScut(dragon,200);
		
		 dragonCuScut.esteLovit(300);
		 
		 
		 
	}

}
