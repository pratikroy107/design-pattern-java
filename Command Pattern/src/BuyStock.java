
public class BuyStock implements Order
{
	private Stock st;
	
	public BuyStock(Stock st) {
		this.st = st;
	}
	
	@Override
	public void execute() {
		st.buy();
	}
}
