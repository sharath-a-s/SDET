package assignment2;

import java.util.Scanner;

public class ODDNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter start range - ");
        int start = sc.nextInt(); 
        System.out.print("Enter end range - ");
        int end = sc.nextInt(); 
        System.out.print("Odd Numbers - ");
        for(int i = start; i <= end; i++) {
        	if(i%2 != 0) {
        		System.out.print(i+" ");
        	}
        }

	}

}
