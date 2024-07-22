
enum Ba {
	HELLO;
	public int i;
	public void show() {
		System.out.println("i = " + i + " ~~ " + this);
	}
}

public class EnumMethod {
	public static void main(String[] args) {
		Ba o1 = Ba.HELLO;
		o1.i = 5;
		o1.show();
		
		Ba o2 = Ba.HELLO;
		o2.i = 10;
		
		o2.show();
		o1.show();
	}
}
