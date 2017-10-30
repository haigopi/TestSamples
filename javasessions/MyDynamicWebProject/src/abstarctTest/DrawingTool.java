package abstarctTest;

public class DrawingTool extends Tool {

	public static void main(String[] args) {

		DrawingTool t = new DrawingTool();
		t.showToolTip();
	}

	@Override
	public void showToolTip() {
		System.out.println("I am a Drawing tool");
	}

}
