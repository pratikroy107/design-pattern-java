
public class MainClass {

	public static void main(String[] args) {
		
		Pizza p = new Decorator1(new Decorator2(new BasePizza()));
		System.out.println(p.bake());
		
		Pizza p2 = new Decorator1(new BasePizza());
		System.out.println(p2.bake());
		
		Pizza p3 = new Decorator2(new Decorator1(new BasePizza()));
		System.out.println(p3.bake());
	}

}
