package ro.ase.csie.stud.semina2.solid;

public class BankAccount {
 private String iban;
 
 private long balance;
 
 private Persoana accountHolder;

public BankAccount(String iban, Persoana persoana) {
	
	this.iban = iban;
	balance = 0;
	this.accountHolder=persoana;
}

public void withdraw(long amount)
{
	balance-=amount;
}

public void deposit(long amount)
{
	
}

public String getIban() {
	return iban;
}



public long getBalance() {
	return balance;
}



public Persoana getAccountHolder() {
	return accountHolder;
}


 


 
 
}
