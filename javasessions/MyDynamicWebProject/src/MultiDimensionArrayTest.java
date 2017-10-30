public class MultiDimensionArrayTest {

	int[][] a = new int[2][];

	int[] c = new int[3];
	
	int[][] b = { { 12, 21 }, { 45, 45, 56 }, { 0, 3, 4 } };

	// int[][] b = new int[3][];

	void printArrayLElements()
	{
		
		c[0] = 1;
		
		a[0] = new int[]{12, 21};
		
		int[] c = new int[3];
		c[0] = 45;
		c[1] = 45;
		c[2] = 56;
		
		a[1] = new int[]{45,45,56};
		
		a[1] = c;
		
				
		for (int i = 0; i < a.length; ++i){
			for (int j = 0; j < a[i].length; ++j){
				System.out.println(a[i][j]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		MultiDimensionArrayTest t = new MultiDimensionArrayTest();
		t.printArrayLElements();
	}

}
