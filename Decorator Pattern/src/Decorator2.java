
public class Decorator2 extends PizzaDecorator {

	public Decorator2(Pizza pz) {
		super(pz);
	}
	
	public String bake() {
		return pz.bake() + "decorator : 2  ";
	}

}
