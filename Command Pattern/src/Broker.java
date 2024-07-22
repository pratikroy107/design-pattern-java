import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Order> ls = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		ls.add(order); //to make queue of commands
	}
	
	public void placeOrder() {
		for(Order o : ls) {
			o.execute();
		}
		ls.clear();
	}
}
