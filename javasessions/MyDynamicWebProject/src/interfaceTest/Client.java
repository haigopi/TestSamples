package interfaceTest;

public class Client {

	public static void main(String[] args) {
		
		//MickeyMouse d = new MickeyMouse();
		
		SoftToy d = new MickeyMouse(); // dsfsdfsd
		d.bodyMadeWith();
		
		d = new Doll(); // dsfsdfsdfsd
		
		d = new TeddyBear();
		
		//d = new SOMETOY();
		
		
		SuperClass s = new ChildClass();
		s.m1();
		
		
		ChildClass c1 = new ChildClass();
		c1.m1();
		
		// polymorphisam
	}
	

	public void myImple(SuperClass c){
		
		
		
	}
}
