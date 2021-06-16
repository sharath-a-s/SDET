import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the year");
		Scanner inputYear= new Scanner(System.in);
		int n ;
		
		n =inputYear.nextInt();
		
		inputYear.close();
		
		if ((n%4==0)&& (n%100!=0) || (n%400==0))// Check if the year is divisible by 4 but not 100, DISPLAY "leap year"// Check if the year is divisible by 400, DISPLAY "leap year"
		{
			System.out.println("Leap year");
		}
		else
			System.out.println("Not a leap year");
		
				
				

	}

}
