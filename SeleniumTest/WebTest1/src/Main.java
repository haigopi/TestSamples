
public class Main {

	public static void main(String[] args) {
		
		
		Main m = new Main();
		
		int result = m.add(90, 90);
		
		System.out.println(result);
		
		result = m.sub(190, 90);
		
		System.out.println(result);
		result = m.multi(190, 90);
		
		System.out.println(result);
	}
	
	public int add(int a , int b){
		return a + b;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int multi(int c,int d){
		return c*d;
	}
	
	
	}

