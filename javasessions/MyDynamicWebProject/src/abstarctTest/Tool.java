package abstarctTest;

public abstract class Tool {

	private int bringhtness;
	
	
	public abstract void showToolTip();


	public int getBringhtness() {
		return bringhtness;
	}


	public void setBringhtness(int bringhtness) {
		this.bringhtness = bringhtness;
	}

	
}
