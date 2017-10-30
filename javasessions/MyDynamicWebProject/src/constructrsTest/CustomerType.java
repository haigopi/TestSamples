package constructrsTest;

public class CustomerType extends Customer{

	int xyz = 0;
	
	public CustomerType(int a, int b) {
		super(12, 12);
		System.out.println("I AM A CHILD's DEFAULT");
	}
//
//	public void m1(){
//		System.out.println(xyz);
//		System.out.println(abc);
//		System.out.println(def);
//	}
//	
//	// 
//	
//	public void m1(int a, String c)
//	{
//		
//	}
	// var - args
	
	String[] a = {"asd", "sfsd", "sdfsd"};
	
	int[] c = {12, 12};	
	double d = 0.0;
	
	public void m1(String... abc){
		
		for (int i =0; i < a.length; ++i){
			
			System.out.println(a[i]);
		}
		
		for (String a : abc){
			System.out.println(a);
		}
		
	}
	
}
