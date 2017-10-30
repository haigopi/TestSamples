package overridingTest;

public class Main {

	
	public static void main(String[] args) {
//		
		Kid k = new Kid();
//		Parent p = new Kid();
//		
		
		try{
			k.test(); // OVER...
		}
		catch(Exception e)
		{
			System.out.println("OKAy DON:T WORRY");
		}
		
//		p.m1(); // PARET
//		
//		k.m2();
//		p.m2();
//		
		//k.m3();
		//p.m3();
		
		
		BlockTest test = new BlockTest();
		
		BlockTest test1 = new BlockTest();
	}
	
}



// EXCEPTION -- > is the super class for all other Exceptions
// CHECKED AND UNCHECKED

//all THE EXCEPTIONS OTHER THAN RUNTIMEEXCEPTION --- COMPILE TIME EXCEPTIOMNS (CHECKED EXCEPTIONS)

// ALL THE EXCEPTIONS WHO ARE SUBSCLASS OF RUNTIME EXCEPTION -- RUNTIMEEZXCEPTIONS (UN CHECEKD EXCEPITNS)

												Exception
												    |
												    |
								.								RuntimeException
																	|
																	|
								.
								.
								.
								.
								.






