
public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		bs.setShopName("novelty");
		bs.loadData();
		System.out.println(bs);
		
		BookShop bs1 = (BookShop)bs.clone();
		System.out.println(bs1); 
		//in deep cloning, it'll give shopName=null;
		//but in shallow cloning, the shopname=novelty;
		
		bs1.setShopName("A1");
		System.out.println(bs1);
		
		bs.getBooks().remove(1);
		bs.getBooks().get(0).setBname("PRATIK!!");//this will not chng bs1 value!!
		System.out.println("bs = " + bs); //it'll REMOVE 1st index value
		System.out.println("bs1 = " + bs1);//it'll HAVE 1st index value
	}
}
