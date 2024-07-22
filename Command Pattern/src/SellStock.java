
public class SellStock implements Order {
	private Stock st;
	
	public SellStock(Stock st) {
		this.st = st;
	}
	
	@Override
	public void execute() {
		st.sell();
	}
}
