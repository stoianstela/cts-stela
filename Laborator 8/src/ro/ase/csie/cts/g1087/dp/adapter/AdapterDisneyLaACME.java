package ro.ase.csie.cts.g1087.dp.adapter;

public class AdapterDisneyLaACME extends ACMECaracterJoc {
	
	 ActiuniiDisney caracterDisney=null;

	public AdapterDisneyLaACME(ActiuniiDisney caracter) {
		super(caracter.getNume(), caracter.getPower());
		this.caracterDisney = caracter;
	}

	@Override
	public void seDeplaseaza() {
		caracterDisney.move(0, 0);
		
	}

	@Override
	public void esteLovit(int puncte) {
		caracterDisney.primesteLovitura(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		caracterDisney.reincarca(puncte);
		
	}
	
	
	

}
