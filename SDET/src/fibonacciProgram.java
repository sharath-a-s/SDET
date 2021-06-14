import java.util.Scanner;

public class fibonacciProgram {

	public static void main(String[] args) {
		
		int inputNumber=0;
		System.out.println("Enter the fibonacci series of"+inputNumber+"term");
		
		Scanner scanner=new Scanner(System.in);
		inputNumber= scanner.nextInt();
		
		int firstdigit=0;
		int seconddigit=1;
		
		for(int i=1; i<=inputNumber;i++)// this loop to execute fibonacci serries of enterd term
		{
			System.out.println(firstdigit+","); // First value
			 int nextdigit=firstdigit + seconddigit;//initially value 0+1
			 firstdigit=seconddigit;// second digit value swapped to firstdigit.
			 seconddigit=nextdigit;// second iteration value of firstdigit(1) and seconddigit(1) 
		}
		

}
}
