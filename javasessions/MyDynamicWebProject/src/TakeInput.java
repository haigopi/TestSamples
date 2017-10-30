import java.io.Console;

public class TakeInput {

	public static void main(String[] args) {

		
		MyUtility u1 = new MyUtility();
		u1.doStuff("23");
		
		//System.exit(0);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		Console c = System.console();

		System.out.println(c);
		char[] pw;

		// pw = c.readPassword();

		// for (char ch : pw) {
		// c.format("%c", ch);
		// c.format("\n");
		// }

		MyUtility u = new MyUtility();
		String name;
		while (true) {
			name = c.readLine("CONSOLE INPUT :  %s %s", "input", " ?");
			c.format("output %s \n", u.doStuff(name));
			
			char[] a = name.toCharArray();
			String output = new String();
			for (char ch : a) {
				output = output + ch;
				output = output + " + ";
			}
			// 3 object 
			System.out.println(String.format(" Output = %s, %s", output, u.doStuff(name))); // 3
		}
	}

}



class MyUtility { // #5: class to test
	String doStuff(String arg1) {

		char[] a = arg1.toCharArray();

		// 2 + 3 = 5
		int total = 0;
		for (char ch : a) {
			System.out.println(ch);
			Integer i = new Integer(ch + ""); // 2
			total = total + i.intValue(); // 
		}

		return total + ""; // + + 2
	}
}