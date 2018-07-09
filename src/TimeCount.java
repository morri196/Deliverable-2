//NumberCompatibility *Spell Check*
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class TimeCount{
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	  
	   
	   
	   int year1;
	   int month1;
	   int day1;
	   int year2;
	   int month2;
	   int day2;
	   int entry1;
	   int entry2;
	   int entryOne;
	   int entryTwo;
	   String entryOnetxt;
	   String entryTwotxt;
	     
	   
	  System.out.println("Enter a date. ex. MMDDYYYY: ");//get input from user
	   entryOne = scnr.nextInt();
	   System.out.println("Enter a second date: ");
	   entryTwo = scnr.nextInt();
	   
	  
	   entryOnetxt = Integer.toString(entryOne);//covert int to string because entry is an integer
	   entryTwotxt = Integer.toString(entryTwo);
	   
	   LocalDate firstDate1 = LocalDate.of(Integer.parseInt(entryOnetxt.substring(3)),Integer.parseInt(entryOnetxt.substring(1,3)),Integer.parseInt(entryOnetxt.substring(0,2)));
	   LocalDate secondDate2 = LocalDate.of(Integer.parseInt(entryTwotxt.substring(3)),Integer.parseInt(entryTwotxt.substring(1,3)),Integer.parseInt(entryTwotxt.substring(0,2)));
	   //converts the entry into date format
	  
			
		Period diff = Period.between(firstDate1, secondDate2);	//allows for time difference to be calculated
			
	  
	   System.out.printf("DIfference is %d years, %d months and %d days", //this prints what the difference is!!!!!!YAY!!!!!
				diff.getYears(), diff.getMonths(), diff.getDays());
		
	}

}
