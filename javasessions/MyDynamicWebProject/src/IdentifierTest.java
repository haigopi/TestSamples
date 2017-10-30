public class IdentifierTest {


	// legal Identifiers
	// Coding Standards - to follow 
	// Java bean naming Standards 
	
	
	// 1. must Start with a letter, or  _ or $ --> must not start with a number
	// 2. After first char, identifiers can conatin any combination of letters, $, _ or numbers
	// 3. Any limit -- No
	// 4. We are not supposed to use any java keywords
	// 5. Java is case sentivie.
	
	int _a;
	int $c;
	
	int _$=90;
	
	int countNumber = 90;
	int Count = 90; //--< does not Java
	
	int fInal;
	
	
	int $_; 
	
	
	
	public static void main(String[] gopi) {

		IdentifierTest test = new IdentifierTest();
	}

}
