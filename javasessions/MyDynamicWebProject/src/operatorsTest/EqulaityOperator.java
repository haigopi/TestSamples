package operatorsTest;

public class EqulaityOperator {

	
	public static void main(String[] args) {
		
		
		int a = 90;
		int b = 90;
		
		if (a == b) // is exactly equals to or not?
		{
			
		}
		
		String abc = "12";
		String def = "safsdfsd";
		
		abc = "34";
		abc = "safsdfsd";
		
		String sda = "asd" + "sf" + "sdfsdf"; // 4 Objects
		
		System.out.println(sda); // asdsfsdfsdf
		
		String asdas = new String("asd");
		
		
		String as = "12";
		String s = new String("fgdf");
		
		System.out.println(abc);
		System.out.println(def);
		if (abc == def){
			//System.out.println("BOTH ARE SAME");
		}
		
		MyObj o1 = new MyObj();
		MyObj o2 = o1;//new MyObj();
		//MyObj o2 = new MyObj();
	
		System.out.println(o1);
		System.out.println(o2);
		
		//o1 == o2
		
			String i = "xyz";
			String ii = "xyz";
			
			ii = "abc";
			
			if ("xyz" != ii)
			{
				
			}
	
		
	} 
	
}

class MyObj{
	
	String abc = "asdasd";
	int a = 90;
	@Override
	public String toString() {
		return a + "";
	}
}
