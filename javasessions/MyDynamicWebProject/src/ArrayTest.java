public class ArrayTest {

	// DECLARE
	// INTIALIZE
	// HOW TO MANIPULATE

	int[] arr = new int[3]; // Declartion --> Object // NOT DYNAMIC

	int[] arr1 = {12, 12,12};
	
	public static void main(String[] args) {

		ArrayTest t = new ArrayTest();
		t.printArrayElements();
	}

	void printArrayElements() {

		arr[0] = 12; // all the index in ajava start s wiyj 0 
		arr[1] = 90;
		arr[2] = 34;

		for (int a = 0; a < arr.length; a = a + 1) {

			System.out.println(arr[a]);

		}

	}

}
