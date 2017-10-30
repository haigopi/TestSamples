import static org.junit.Assert.assertEquals;



public class Test {
	
   @org.junit.Test
   public void test(){
	   
	   Main m = new Main();
	   int c = m.add(10,10);
	   int n = m.sub(20,10);
	   int s = m.multi(10,10);
	   assertEquals(20, c);
	   assertEquals(10,n);
	   assertEquals(10,s);
	   
	   
   }
}
