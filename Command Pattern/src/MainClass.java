
public class MainClass {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		BuyStock bs = new BuyStock(stock);
		SellStock ss = new SellStock(stock);
		
		Broker br = new Broker();
		br.takeOrder(bs);
		br.takeOrder(ss);
		
		br.placeOrder();

	}

}
