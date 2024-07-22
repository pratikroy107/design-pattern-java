
public class Decorator1 extends PizzaDecorator {

	public Decorator1(Pizza pz) {
		super(pz);
	}
	
	public String bake() {
		return pz.bake() + "decorator : 1  ";
	}

}
