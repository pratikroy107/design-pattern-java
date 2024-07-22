
public class PizzaDecorator implements Pizza {

	protected Pizza pz;
	public PizzaDecorator(Pizza pz) {
		this.pz = pz;
	}
	@Override
	public String bake() {
		return pz.bake();
	}

}
