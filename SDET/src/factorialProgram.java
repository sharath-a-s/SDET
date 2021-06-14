import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber;
		System.out.println("Enter the number: ");
		
		Scanner scanner= new Scanner(System.in);
		inputNumber= scanner.nextInt();
		
		int i=1;
		int fact=1;
		while(i<=inputNumber)
		{
			fact= fact *i;
			i++;
			
		}
		System.out.println("factorial of"+" "+inputNumber+" "+"is :"+fact);

	}

}
