package staticexe;

public class Home extends Object{

	static Home home;
	
	String cement;
	
	private Home(String cenmentType){
		cement = cenmentType;
	}
	
	public static Home getInstance(){
		
		if (home == null){
			home = new Home("ghjghj");
		}
		return home;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		throw new CloneNotSupportedException("Clone not supprted");
	
	}
	
	
}

