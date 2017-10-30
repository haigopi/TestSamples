package inheritenceTest;

import interfaceTest.SoftToy;

public class ABCTeddyBear extends Object implements SoftToy {

	public static void main(String[] args) {
		
		String s = new String();
		ABCTeddyBear vbear = new ABCTeddyBear();
		
	}
	
	@Override
	public void m1() {
	
		try{
			System.out.println(a/0);
		}catch(Exception e ){
			// thrers
		}finally{ //final 
			//gjhghjghghghj
		}
	
	}
	
	
	@Override
	public void m12() {
	
		
	}
}
