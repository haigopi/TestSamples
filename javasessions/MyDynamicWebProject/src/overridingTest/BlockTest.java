package overridingTest;

public class BlockTest {

	static int i =0;
	
	// anonymus
	static {
		System.out.println("BLOCK" + (++i));
	}
	
	public BlockTest() {
		System.out.println("CONSTRUCTOR");
	}
	
}


