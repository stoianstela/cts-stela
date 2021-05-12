package ro.ase.csie.cts.g1087.dp.memento;

public class CaracterJoc {

	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	
	public void ataca()
	{
		
	}
	
	public void seVindeca()
	{
		
	}
	
	public void seDeplaseaza()
	{
		
	}
	
	
	public MementoCaracterJoc salvare()
	{
		return new MementoCaracterJoc(denumire, puncteViata, abilitatiMagice);
	}
	
	
	public void incearcaSalvare(MementoCaracterJoc salvare)
	{
		this.denumire=salvare.denumire;
		this.puncteViata=salvare.puncteViata;
	}
}
