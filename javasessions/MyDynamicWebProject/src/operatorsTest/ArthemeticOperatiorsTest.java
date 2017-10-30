package operatorsTest;

public class ArthemeticOperatiorsTest {

	// +  - *  /
	
	enum CS {BIG, SMALL};
	
	
	public static void main(String[] args) {
		
		int a = 90;
		int b = 90;
		
		System.out.println(a / 1);
		
		String s = new String("ABC");
		String s1 = "DEF";
		
		System.out.println(s + s1); // - 
		
		Object o1 = "dfsd";
		Object o2 = new Object();
		
		// System.out.println(o1 + o2);
			
		CS c1 = CS.BIG;
		CS c2 = CS.SMALL;
		
		// System.out.println(c1 + c2);
		
		
		//Incremetor;
		
		
		System.out.println(++a); // 1 increement
		System.out.println(a++); // 1 
		
		
		for (a = 5; a > 0;){
			System.out.println(a--);
		}
		
		
		
//		for (a = 0; a < 5; ++a){ // 0, 1
//			System.out.println(a);
//		}
//		
		
		;
		
		
		
	} 
	
}
