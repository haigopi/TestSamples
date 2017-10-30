import java.util.Date;

public class TestCurrentMemery {

	public static void main(String[] args) {

		Runtime t = Runtime.getRuntime();

		System.out.println("free : " + t.freeMemory());

		MyClass d;

		for (int i = 0; i < 100000; ++i) {

			d = new MyClass();
		}

		System.out.println("free : " + t.freeMemory());

		t.gc();
		System.out.println("free : " + t.freeMemory());
	}

}

class MyClass{
	
	@Override
	protected void finalize() throws Throwable {
		//System.out.println("Finalize is called");
	}
}
