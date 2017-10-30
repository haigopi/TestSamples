package stack;
class Collar{
}
public class Dog {
	Collar c; // Instance 
	String name; // instance var
	
	public static void main(String[] args) {
		
		Dog d; // local 
		d = new Dog();
		d.go(d);
	}
	void go(Dog dog){	// dog is local
		c = new Collar();   // NOT a local 
		dog.setName("Akira"); // method call
	}
	void setName(String dogName){
		name = dogName;
		// do .....
	}
}
