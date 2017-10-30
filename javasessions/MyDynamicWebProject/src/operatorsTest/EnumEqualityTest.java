package operatorsTest;

public class EnumEqualityTest {

	
	enum CoffeeSize { BIG, SMALL, MEDUIM}
	
	
	public static void main(String[] args) {
		
		
		// Equality Test while using ENUMs
		
		CoffeeSize size = CoffeeSize.BIG;
		CoffeeSize size1 = CoffeeSize.SMALL;
		
		
		if (size == size1){
			System.out.println("TRUE");
		}

		int a = 90;
		int b = 90;
		
		if (a == b){
			System.out.println("TRUE");
		}
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		
		if (o1 == o2){
			System.out.println("FALSE");
		}
		
		
		
	} 
	
	
}
