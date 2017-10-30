package one;

// protected can't be used infront of the class

// with in the same class
// with in the same package - out side classes
// out side of the package -- out side classes

// Through inheritence.

public class ProtectedTest {
	
	
	 int a = 90;
	
	protected void m1(){
		System.out.println(a);
	}
	
}

class Abc{
	
	public static void main(String[] args) {
		
		ProtectedTest test = new ProtectedTest();
		System.out.println(test.a);
		
	}
}
