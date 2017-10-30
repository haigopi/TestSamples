package overridingTest;

public class Kid extends Parent{

	
	@Override
	public void m1() {
		System.out.println("OVERRIDEEN METHOD");
	}
	
	
	public void m3(int b, int a, boolean c) {
		System.out.println("I AM KID M3");
	}
	// visinilty
	// return type
	// method name
	// arguments
	// throws clause parent method must be parent itself.
	
	
	@Override
	public int test() throws IllegalArgumentException{ // sub class for Exception
		
		return 0;
	}
}
