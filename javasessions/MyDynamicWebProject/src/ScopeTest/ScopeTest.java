package ScopeTest;

public class ScopeTest extends Super{

	
	static int s =  3443; // static var - Yes -- No -- Class Loaded -- Stack
	int x ; 
	
	{
		x = 7; int x2 = 90;
		System.out.println("TEST BLOCK");
	} // instance level block;
	
	public ScopeTest() {
		
		int x3 = 78;
		
		super();
		System.out.println("TEST");
		
		System.out.println("TEST END");
		
		System.out.println(x2);
		
	}
	
	void doStuff(){
		
		int abc = 90;
		
		
//		.
//		.
//		.
//		.
//		.
//		
		
	}
	
	
	public static void main(String[] args) {
		
		ScopeTest t = new ScopeTest();
		
	}
}
