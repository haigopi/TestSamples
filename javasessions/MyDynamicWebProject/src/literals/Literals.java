package literals;

import java.awt.print.Book;

public class Literals {

	
	// literals
	
	char g = 'b';
	int a = 90;
	boolean b = false;
	
	String s = "asd";
	
	float ff = 234.33F;
	double d = 23423.4534D;
	
//	Double dd = new Double(234234.24234);
//	//Wrapper Classes
//	
//	Boolean gggb = new Boolean(false);
	
	
	
	int abc = 0666; // OCTAL Listeral
		
	public static void main(String[] args) {
		
		int xyz = 0X12; // HEXA 
		
		Literals l = new Literals();
		
		System.out.println(xyz);
		
		System.out.println(l.abc);
	}
	
}

class MyWrapper{
	
	Literals l = new Literals();
	
	
	 Double getDoubleInObj(){
		
		 return new Double(l.d);
		
	}
	 double getDoubleinPremitive(){
		
		 return l.d;
	}
	
	
}


class Customer{
	
	public static void main(String[] args) {
		
		MyWrapper w = new MyWrapper();
		
		w.getDoubleInObj();
			
	}
	
}
