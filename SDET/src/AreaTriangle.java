import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the height: ");
		double height=input.nextInt();
		
		//System.out.println(" ");
		System.out.print("Enter the breadth: ");
		double base =input.nextInt();
		
		//System.out.println(" ");
		double area = ((height*base)/2);
		System.out.print("Area of triangle:"+area);
		

	}

}
