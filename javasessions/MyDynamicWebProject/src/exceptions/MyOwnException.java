package exceptions;

public class MyOwnException extends RuntimeException {

	// JVM
	// PROGRAMITCALLY

	public MyOwnException(String s) {
		super(s);
	}
}

// class Integer{
//
//
// void intValue(){
// boolean isParsed = false;
//
// //
// //
// if(isParsed){
// // return ;
// } else
// {
// throw new NumberFormatException();
// }
//
// }
// }

class NFE {

	public static void main(String[] args) {

		NFE n = new NFE();
		try {
			n.printNumber("123");
			System.out.println("asfsdfsds");
			System.exit(0);
		} catch (NumberFormatException e) {
			throw e;
		} catch (Exception e) {
			//throw e;
		}
		catch (Throwable e) {
			//throw e;
		}
		finally{
			System.out.println("FINALLY");
		}
		
		System.out.println("ABC");
//		gfh
//		gf
//		hgf
//		h
//		gf
//		h
//		gfh
//		
	}

	void printNumber(Object o) {

		Integer i = new Integer((String) o);
		System.out.println(i.intValue());

	}

}

class Go {

	static String s;

	public static void main(String[] args) {

		System.out.println(s.length());

		Go go = new Go();

		go.m1();
	}

	public void m1() {
		m1();
	}
}