package Calculators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
		    double num1, num2;
		    System.out.println("Select an operation:");
		    System.out.println("1. Add");
		    System.out.println("2. Subtract");
		    System.out.println("3. Multiply");
		    System.out.println("4. Divide"); 

	        int operation = scanner.nextInt();
	        System.out.println("Enter the first number:");
	        num1 = scanner.nextDouble();
	        System.out.println("Enter the second number:");
	        num2 = scanner.nextDouble();

	        switch (operation) {
	            case 1:
	            	
	                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	                break;
	            case 2:
	            	
	                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	                break;
	            case 3:
	            	
	                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	                break;
	            case 4:
	            	
	                if (num2 == 0) {
	                    System.out.println("Cannot divide by zero.");
	                } else {
	                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	                }
	                break;
	            default:
	                System.out.println("Invalid operation.");
	                break;
	        }
    }
}
