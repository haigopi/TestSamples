package two;

import one.ProtectedTest;

public class ProtectedTestInDifferentPackage extends ProtectedTest {

	public void m1() {

		ProtectedTest t1 = new ProtectedTest();
		ProtectedTest t2 = new ProtectedTest();
		System.out.println(t1 + ":" +t2);
		System.out.println(t2.equals(t1));
		
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		ProtectedTestInDifferentPackage p = new ProtectedTestInDifferentPackage();
		p.m1();
		
	}
}
