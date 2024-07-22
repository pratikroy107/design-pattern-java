
class B {
	static B obj;

	private B() {
		// private constructor created, so object cannot be created from outside this
		// class, i.e., main
		System.out.println("A lazy called...!");
	}

	public static B getInstance() {
		if (obj == null)
		{
			synchronized(B.class)
			{
				if(obj == null)
					obj = new B();
			}
		}
		return obj;
	}
}

public class DoubleCheckedLocking {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				B ob = B.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				B ob = B.getInstance();
			}
		});
		t1.start();
		t2.start();
	}

}
