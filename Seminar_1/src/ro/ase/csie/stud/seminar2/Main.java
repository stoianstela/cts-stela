package ro.ase.csie.stud.seminar2;

import ro.ase.csie.stud.semina2.solid.BankAccount;
import ro.ase.csie.stud.semina2.solid.Persoana;

public class Main {
	
	public static void main(String[] args)
	{
		
		
		Persoana p = new Persoana("Stela");
		BankAccount account = new BankAccount("INGB73463832",p);
		
//				CalendarUtil cu= new CalendarUtil();
//				
//				
//			
//				try {
//					System.out.println(cu.weekDay(10));
//					
//					System.out.println(cu.weekDay(3));
//					
//					System.out.println(cu.weekDay2(3));
//					
//					System.out.println(cu.weekDay3(3));
//					
//					System.out.println(cu.weekDay3(10));
//					
//					System.out.println("DateFormatSymbols says" + cu.weekDay4(10));
//					System.out.println("DateFormatSymbols says" + cu.weekDay4(5));
//				} catch (IncorrectDayException e) {
//					
//					e.printStackTrace();
//				}

		
		account.deposit(100);
		account.withdraw(50);
		account.withdraw(70);
		
		System.out.println(account.getBalance());
		 
	}

}
