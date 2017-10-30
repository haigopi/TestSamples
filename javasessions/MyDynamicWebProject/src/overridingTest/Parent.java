package overridingTest;

public class Parent {

	public void m1(){
		System.out.println("Parent M1");
	}
	
	public void m2() {
		System.out.println("I AM M2");

	}
	
	void m3(int a, int b, boolean c) {
		System.out.println("I AM M3");
	}
	

	
	public int test() throws Exception{
		
		System.out.println("TEST1");
	
		{
			System.out.println("Test");
		}
		
		return 0;
	}
}
