package noEnumTest;

public class MyConstants {

	public static void main(String[] args) {
		
		CoffeeSize size = new CoffeeSize();
		System.out.println(size.getCoffee("BIG"));
		
		System.out.println(size.getCoffee("ABCD"));
		
		System.out.println(size.getCoffee("LARGGGE")); // problem 2 
		
		
		
	}
	
}


class CoffeeSize{
	
	final int BIG = 60;
	final int MEDIUM = 30;
	final int SMALL = 15;
	
	final String asdasdasdasdas = "LARGE"; // SAME NAMES & VALUES  PROBLEM 3
	final String SMALLL = "SMALL"; // SAME NAMES & VALUES  PROBLEM 3
	final String MEDIUMM = "MEDIUM"; // SAME NAMES & VALUES  PROBLEM 3
	
	
	// PROBLEM 4 - MAINTAING THESE CONSTANTS 
	
	// PROBLEM 5 - 
	
	public int getCoffee(String userInput){ // Problem 1 -- Accepts any input
		
		
		
		
		if(userInput.equals(asdasdasdasdas)){
			return BIG;
		} 

		if(userInput.equals(SMALLL)){
			return SMALL;
		} 
		
		if(userInput.equals(MEDIUMM)){
			return MEDIUM;
		} 
		
		return 0;
		
	}
	
	
}