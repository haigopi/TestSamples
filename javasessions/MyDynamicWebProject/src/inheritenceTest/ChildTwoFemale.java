package inheritenceTest;

public class ChildTwoFemale extends Father {

	//String behvior = "My personal behavior";
	
	void m1(){
		System.out.println(this.behvior);
	}

	
	public static void main(String[] args) {
		ChildTwoFemale f = new ChildTwoFemale();
		f.m1();
	}
}
