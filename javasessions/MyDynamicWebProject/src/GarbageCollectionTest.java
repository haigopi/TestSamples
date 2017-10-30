public class GarbageCollectionTest {

	GarbageCollectionTest t;

	public static void main(String[] args) {

		GarbageCollectionTest t = new GarbageCollectionTest();
		GarbageCollectionTest t1 = new GarbageCollectionTest();
		GarbageCollectionTest t2 = new GarbageCollectionTest();

		t.t = t1;
		t1.t = t2;
		t2.t = t;

		t = null;

		t1 = null;
		t2 = null;

	}

}
