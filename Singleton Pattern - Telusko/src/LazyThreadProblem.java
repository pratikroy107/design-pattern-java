
class A {
	static A obj;

	private A() {
		// private constructor created, so object cannot be created from outside this
		// class, i.e., main
		System.out.println("A lazy called...!");
	}

	public static A getInstance() {
		// synchronized will allow only one thread to enter at once
		if (obj == null)
			obj = new A();
		return obj;
	}
}

public class LazyThreadProblem {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				A ob = A.getInstance();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				A ob = A.getInstance();
			}
		});
		t1.start();
		t2.start();
		// 2 objects are getting created!! (FAILED)
		// "synchronized" can solve the problem ->
		// but synchronized makes the execution of function very slow...
		// so we can use "Double checked locking"

	}

}
