package constructrsTest;

public class Main {

	public static void main(String[] args) {
		
//		Customer c = new Customer();
//		System.out.println(c.abc); //0 
//		Customer c1 = new Customer(12);
//		System.out.println(c1.abc); //0 
//		Customer c2 = new Customer(12, 12);
//		System.out.println(c.abc); // 12
		
		
		
		CustomerType t = new CustomerType(12, 12);
		//t.m1(12, "abc");
		
		t.m1("abc", "asd", "asdas", "sdfsd", "asasd");
	}
}
