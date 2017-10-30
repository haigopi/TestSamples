package constructrsTest;

public class Customer  extends Object{

	 protected int abc, def;

	// Default - no return type
	
		// abstract public Customer(); -- not possible
	
		public Customer() {
		
			System.out.println("I am Deafult");
		}

		// over loaded
		protected Customer(int a){
			
			System.out.println("I I OVER LOADED");
		}
		
		// over loaded
		protected Customer(int a, int b){
		
			this.abc = a;
			this.def = b;	
			System.out.println("I OVER LOADED");
		}
	
	protected void customer(){
	}
	
}
