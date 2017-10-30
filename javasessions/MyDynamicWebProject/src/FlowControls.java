import java.util.ArrayList;

public class FlowControls {

	public static void main(String[] args) {
		FlowControls f = new FlowControls();
		//f.forTest();
		f.continueTest();
		

	}

	
	
	private void continueTest(){
		
		
		for(int a =0; a< 90 ; ++a){
			System.out.println("before condition check" + a);
			
			if (a == 5){
				System.out.println(a);
				continue;
			} 
			System.out.println("ELSE"+a);
		}
		
		
	}
	public void forTest() {
	
			// 
		//for (// Declartion ; // Ex[pression)
		
		for (int a = 0;a<=5; ++a){
			System.out.println(a);
		}
		
		int[] intArray = {0,1,2,3,4};
		
		String[] s = {"a", "B", "C"};
		
		Object[] o = {"fgh", "fghgfh", "fghgf"};
		
		ArrayList<String> l = new ArrayList<>(); // Generics
		l.add("asdfs");
		l.add("asdfs");
		l.add("asdfs");
		l.add("asdfs");
		
//		for (String a = "" ; a < intArray.length; ){
//			System.out.println(intArray[a]);
//		}
		
		for (String a : l){
			System.out.println(a);
		}
		
		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
		
		
	}
	
	
	public void whileTest() {
		
		//int a = int.le;
//		int i =0;
//		while(i <= a){
//			System.out.println(++a);
//			//--a
//		}
		
		
	}

	public void doWhileTest() {
		
		int a = 0;
		do{
			System.out.println(++a);
		} while(a <= 5);
		
		
	}

	public void switchTest() {
		int a = 90;
		// boolean b = false; Not allowed
		// float f = 90.00f; // if convert to in is is allowed

		// if(true){
		// break;
		// }

		String s = new String("DEghgfF");
		switch (s) {

		case "ABC": {
			System.out.println("ABC");
			break;
		}

		case "DEF": {
			System.out.println("DEF");
			break;
		}

		case "AdBC": {
			System.out.println("AdBC");
			break; // continue;
		}

		default: {
			System.out.println("NONE FOUND");
		}
		}
	}

	// switch

	/*
	 * if (a > b){
	 * 
	 * } else if ( b > c) {
	 * 
	 * } else if ( c < a) {
	 * 
	 * } else if (d < e){
	 * 
	 * } else{
	 * 
	 * }
	 */

}
