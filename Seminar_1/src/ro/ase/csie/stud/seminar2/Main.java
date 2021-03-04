package ro.ase.csie.stud.seminar2;
public class Main {
	
	public static void main(String[] args)
	{
		
				CalendarUtil cu= new CalendarUtil();
				
				
			
				try {
					System.out.println(cu.weekDay(10));
					
					System.out.println(cu.weekDay(3));
					
					System.out.println(cu.weekDay2(3));
					
					System.out.println(cu.weekDay3(3));
					
					System.out.println(cu.weekDay3(10));
					
					System.out.println("DateFormatSymbols says" + cu.weekDay4(10));
					System.out.println("DateFormatSymbols says" + cu.weekDay4(5));
				} catch (IncorrectDayException e) {
					
					e.printStackTrace();
				}

		 
	}

}
