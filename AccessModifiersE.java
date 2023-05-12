package accessModifiersEx;

public class AccessModifiersE {

	public int publicVar;
    private int privateVar;
    protected int protectedVar;

    public void setPrivateVar(int newValue) {
        privateVar = newValue;
    }

    public int getPrivateVar() {
    	return privateVar;
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }


    public static void main(String[] args) {
    	// TODO Auto-generated method stub
	
    	AccessModifiersE O1 = new AccessModifiersE();

    	O1.publicVar = 10;
    	O1.setPrivateVar(5);
    	O1.protectedVar = 20;

    	System.out.println("Public variable value: " + O1.publicVar);
    	System.out.println("Private variable value: " + O1.getPrivateVar());
    	System.out.println("Protected variable value: " + O1.protectedVar);

    	O1.protectedMethod();
    }
}

