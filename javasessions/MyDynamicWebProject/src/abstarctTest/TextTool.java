package abstarctTest;

public class TextTool extends Tool{

	
	
	public static void main(String[] args) {
		
		TextTool t = new TextTool();
		t.showToolTip();
		
	}
	
	@Override
	public void showToolTip() {
	
		System.out.println("I AM A TEXT");
		
		getBringhtness();
		
	}
}
