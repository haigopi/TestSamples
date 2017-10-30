
/*
Class - A template that describes the kinds of -  state and Behavior  - that objects - of its type support.

Object - At Runtime, when JVM (Java Virtual Machine) encounters the "new" keyword, it will use the appropriate class to make an object which is an instance of that class.
   That object will have its own state and access to all of the behaviors defined by its class.  

State (instance variables) - Each object will have its own unique set of instance variables as defined in the class. 
The values assigned to an objects instance variables make up  the objects state.

Behavior - When a devepoer creates a class. he/she creates methods inside the class. Methods are where the class's logic is stored. Methods are where the real work
gets done.They are where algorithms get executed, and data gets manipulated.

*/

/**
 * @author GeetaKrishna
 * This class will help to hold the customer personal information
 */
public class Operation {

	int a;
	int b = 100;
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Operation op = new Operation();
		op.a = 788;
		op.b = 677;
		Operation op1 = new Operation();
		
		op.add();
		
		op1.add();
	}
		
}

//a = 32bits
// b = 32birs


