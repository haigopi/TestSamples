package two;


// Private access modifier will not be allowed infornt of your class

public class PrivateTest {
	
	private int a = 10; 
	/// Private can be accessed only inside the class
	//   1. in a different class in the same file
	//   2. In a different class in the same package
	//   3. In  a differnt class in a differnt Package
	
	public int b = 100;
	
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.a);
	}

}


class Test{
	
	public void m1(){
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.b);
		
	}
	
}
