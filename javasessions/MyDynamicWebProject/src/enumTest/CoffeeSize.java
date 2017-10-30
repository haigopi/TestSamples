package enumTest;


// 1.5
public enum CoffeeSize { // static , final, private, protected, abstract 

	BIG(60), SMALL(15), MEDIUM(30);
	
	int ounce;

	public int getOunce() {
		return ounce;
	}

	CoffeeSize( int a) {
		ounce = a;
	}

}


class CoffeeMachine{
	
	
public int getCoffee(CoffeeSize userInput){ // Problem 1 -- Accepts any input
		System.out.println(userInput);
		System.out.println(userInput.name());
		System.out.println(CoffeeSize.values());
		
		
		
		
		for (CoffeeSize size : CoffeeSize.values()){
			System.out.println(size.name());
		}
		
		System.out.println(CoffeeSize.valueOf("dsfhsdfghsdf"));
	
	if(userInput.equals(CoffeeSize.MEDIUM.name())){
		return CoffeeSize.MEDIUM.getOunce();
	}
	
	if(userInput.equals(CoffeeSize.BIG.name())){
		return CoffeeSize.BIG.getOunce();
	}
	
	if(userInput.equals(CoffeeSize.SMALL.name())){
		return CoffeeSize.SMALL.getOunce();
	}
	
	return 0;
		
	}
}


class Main{
	

	enum numbers {ONE, TWO};
	public static void main(String[] args) {
		
		
		System.out.println(numbers.ONE);
		CoffeeMachine machine = new CoffeeMachine();
		System.out.println(machine.getCoffee(CoffeeSize.MEDIUM));
		
	}
}