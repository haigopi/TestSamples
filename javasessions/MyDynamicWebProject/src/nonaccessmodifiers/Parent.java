package nonaccessmodifiers;

public class Parent {

	public String name= new String();
	public String name1 = new String();
	

	public String getName() {
	
		
		System.out.println(name1.toString());
		
		return name;
		
	
	}

	public void setName(String n) {
		this.name = n;
		System.out.println(this.name);
	}


	
	
	
}
