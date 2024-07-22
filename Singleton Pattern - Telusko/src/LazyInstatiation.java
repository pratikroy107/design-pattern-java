
class Ab {
	static Ab obj;
	private Ab()
	{
		//private constructor created, so object cannot be created from outside this class, i.e., main
		System.out.println("Ab lazy called...!");
	}
	public static Ab getInstance() {
		//static methods can be called without creating object of a class
		if(obj == null)
			obj = new Ab();
		return obj;
	}
}

public class LazyInstatiation {

	public static void main(String[] args) {
		Ab ob = Ab.getInstance();
		Ab ob1 = Ab.getInstance();
	}

}
