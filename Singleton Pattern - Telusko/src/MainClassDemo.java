
class Abc {
	static Abc obj = new Abc();
	private Abc()
	{
		//private constructor created, so object cannot be created from outside this class, i.e., main
		System.out.println("Abc called...!");
	}
	public static Abc getInstance() {
		//static methods can be called without creating object of a class
		return obj;
	}
}

public class MainClassDemo {
	public static void main(String[] args) {
		Abc ob = Abc.getInstance();
		//Abc ob = new Abc(); -> not possible bcoz private constructor
		Abc ob1 = Abc.getInstance(); //here we'll get same instance, i.e., obj...
		//here ob1 is getting value of obj...
		// and above, ob was storing value of obj...
		//anyhow, object is created only once!!
	}
}
