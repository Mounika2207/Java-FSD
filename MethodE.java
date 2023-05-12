package MethodEx;

public class MethodE {

		// TODO Auto-generated method stub
			  
			  
	public static int sum(int a, int b) {
		return a + b;
	}
			  
	public static void main(String[] args) {
		//call sum method	    
		int result = sum(2, 3);
		if (result == 5) {
			System.out.println("sum(2, 3) is working correctly!");
		} else {
			System.out.println("sum(2, 3) is NOT working correctly!");
		}
		// calling sum using different arguments    
		result = sum(4, 5);
		if (result == 9) {
			System.out.println("sum(4, 5) is working correctly!");
		} else {
			System.out.println("sum(4, 5) is NOT working correctly!");
		}
		// calling sum using variables	    
		int x = 6;
		int y = 7;
		result = sum(x, y);
		if (result == 13) {
			System.out.println("sum(x, y) is working correctly!");
		} else {
			System.out.println("sum(x, y) is NOT working correctly!");
		}
		//calling sum method with different argument types	    
		double d1 = 1.5;
		double d2 = 2.5;
		int i1 = 3;
		int i2 = 4;
		result = sum((int)d1, (int)d2);
		if (result == 3) {
			System.out.println("sum((int)d1, (int)d2) is working correctly!");
		} else {
			System.out.println("sum((int)d1, (int)d2) is NOT working correctly!");
		}
		result = sum(i1, i2);
		if (result == 7) {
			System.out.println("sum(i1, i2) is working correctly!");
		} else {
			System.out.println("sum(i1, i2) is NOT working correctly!");
		}
		// calling sum method using different number of arguments	    
		//result = sum(1, 2, 3); This result in a compiler error
	  }


}
