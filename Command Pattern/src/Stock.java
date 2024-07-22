
public class Stock {
	String name = "helloworld";
	int quantity = 100;
	
	public void buy() {
		System.out.println("stock : " + name + " , quantity : " + quantity + " BOUGHT :)");
	}
	
	public void sell() {
		System.out.println("stock : " + name + " , quantity : " + quantity + " SOLD :(");
	}
}
