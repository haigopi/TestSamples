package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Encapusulation {
	
	// JKeep instance variables private.
	// provide getters and setters -- accesor methods. -- public 
	// Java Beans Specification
	
	private List names;

	public Object getNames() {
		
		String[] s = {};
		
		return s;
	}

	public void setNames(List names) {
		this.names = names;
	}

	
	public static void main(String[] args) {
	//	Child p = new Child();
		List l = new ArrayList<>(); 
		
		
		ArrayList l1 = (ArrayList)l;		
		
		
		//p.m1("qbc", 90);
		
		
		Parent p = new Male();
		Parent p1  = new Female();
		
		
		Female p2 = (Female)p1;
		
		p1 = (Parent)p2;
		
		
		if (p1 instanceof Parent){
			System.out.println("P1 is a parent");
		} 
		if (p1 instanceof Male){
			System.out.println("P1 is a Male");
		}
		if (p1 instanceof Female){
			System.out.println("P1 is a Female");
		}
		
		
		if (p2 instanceof Parent){
			System.out.println("P2 is a parent");
		}
		
		if (p2 instanceof Female){
			System.out.println("P2 is a Female");
		}
		
		
		
		
		Encapusulation e = new Inheritance();
		e.getNames();
		//p.m2();
	}
}

class Inheritance extends Encapusulation{
	
	//Legs legs;
	// To promote the code reuse
	// to achive polymorphism
	
	List l = new ArrayList<>(); // Has - A 

	public void m1(){
		l = new Vector();	// IS - A RELATION
	}
	
	Inheritance i; // HAS - A Relation
	
	@Override
	public ArrayList getNames() {
		return null;
	}

}
class Parent  {

	public void color(){
		System.out.println("BROWN");
	}
	
	
	void m1(int a)  {
		System.out.println("m1");
	}
	
	Vector m1(String a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Male extends Parent{
	
	public void canTakeDowry(){
		System.out.println("YES");
	}
	
	void m1(String a)
	{
		System.out.println("I am m1");
	}
	
	
	void m2(){
		System.out.println("m2");
	}
}

class Female extends Parent{
	
	public void canGiveBirth(){
		System.out.println("YES");
	}
	
	void m1(String a)
	{
		System.out.println("I am m1");
	}
	
	
	void m2(){
		System.out.println("m2");
	}
}
