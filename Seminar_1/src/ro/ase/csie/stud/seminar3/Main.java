package ro.ase.csie.stud.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
public static void main(String[] args) {
		
		
		
			
		
		Map<Person, BankAccount> employees = new HashMap<>();
		
		Person p1 = new Person("Chuck Norris");
		BankAccount b1= new BankAccount("RFREZ2358724", p1);
		
		Person p2 = new Person("Chuck Norris");
		BankAccount b2= new BankAccount("RFZER2358724", p2);
		
		
		Person p3 = new Person("Van Damme");
		BankAccount b3= new BankAccount("RFERTFZ2358724", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		for(BankAccount a : employees.values())
		{
			a.deposit(1000);
		}
		
		for(BankAccount a : employees.values())
		{	try {
			a.withdraw(10);
		}
		
		catch(InsuficientFundsException ex)
		{
			System.out.println(ex.getMessage());
		}
		}
		
	
		


	}

}
