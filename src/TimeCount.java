import java.util.Scanner;
//NumberCompatibility *Spell Check*

public class TimeCount {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);//allows for user input
		
		int monthNum;
		int dayNum;
		int yearNum;
		int monthNum2;
		int dayNum2;
		int yearNum2; // i used int because i want the user input in numbers only
		
		monthNum = scnr.nextInt();
		monthNum2 = scnr.nextInt();
		dayNum = scnr.nextInt();
		dayNum2 = scnr.nextInt();
		yearNum = scnr.nextInt();
		yearNum2 = scnr.nextInt();
		
		System.out.print("Enter a date. Ex. (09/23/1984) using numerical expressions only:  ");
		System.out.println(monthNum + "/" + dayNum + "/" + yearNum); // I want this line to appear on the same line as "Enter a Date
		System.out.print("Enter a second date greater than the first. Ex. (09/23/2004):  "); //I want this line and the next to appear on one line together
		System.out.println(monthNum2 + "/" + dayNum2 + "/" + yearNum2);
		
		System.out.print("Now let see how much time is inbetween the two dates you entered");
		
		/*next Statement with need to express and equation that wold give a number that 
		 * expresses the amount of time inbetewen the dates from the user input*/
		 
		Number of months 
		
		int numDate = 'monthNum' 'dayNum' 'yearNum';
		
		
		
	}

}
