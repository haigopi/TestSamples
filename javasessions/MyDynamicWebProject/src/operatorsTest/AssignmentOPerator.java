package operatorsTest;

import java.util.ArrayList;

public class AssignmentOPerator {

	public static void main(String[] args) {

		
		
		
		// =

		// premitives --- size matters
		// refreces -- type matters

		
		// Compound assignment
	
		int y = 10;
		
		//y = y+20;
		//y+=20;
		
		y=+20;
		y=-20;
		
		System.out.println(y);
		
		short a = 32767; //32
		int b = 30; // 64   10100000000000000
		b = a; // size // 000000000000101010101010101010 32767

		
		ArrayList l = new ArrayList<>();
		Object o = new Object();
		String s = new String();

		o = s;
		
		
		
		
		
		System.out.println(b + "" + a);

	}

}
