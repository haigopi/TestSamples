package operatorsTest;

public class LogicalOperator {

	// &
	// |
	// ^

	// !
	// &&
	// ||

	public static void main(String[] args) {

		// ! && ||

		// && -- with multiple expressions - n number -- all must be results to
		// true
		// --> TRUE

		// || -- with multiple expressions - n number -- atleats one must be
		// results to true
		// --> TRUE

		int a = 100;
		int b = 100;

		if ( a == b || (a >= b && b < a) ) {
			System.out.println("TRU");
		}

		String s = "ABC";
		String s1 = "DEF";

		boolean result = ((s != s1) ? true : false);

		System.out.println(result);

		if ((a != b)) // (! (a == b))
		{
			System.out.println("ABC");
		} else {
			System.out.println("DEF");
		}

		System.out.println(a & b);

	}

}
