package nonaccessmodifiers;

// final abstarct

final public class Sub {

	
   
   
	public static void main(String[] args) {

		
		Sub s = new Sub();
		s.printName();
		System.out.println(s);
		
		
	}
	
	@Override
	public String toString() {
		
		return "sdfsdfsd";
	}
	
	final public void setName(String n) {
	
		System.out.println("I AM A OVERDIE METHOD");
	}
	
	
	
	public void printName(){
		int a;
		String abc = null;
		System.out.println(a);
		setName("ABC");
	}

}
