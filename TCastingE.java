package TCastingEx;

public class TCastingE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implicit casting - from int to double
		int num1 = 10;
        double num2 = num1;
        System.out.println("Implicit casting: " + num2);
		        
        // Explicit casting - from double to int
        double num3 = 20.5;
        int num4 = (int) num3;
        System.out.println("Explicit casting: " + num4);
    }
	
}
