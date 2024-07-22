
public class MainClass {
	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		
		NewsChannel observer1 = new NewsChannel("channel-1");
		NewsChannel observer2 = new NewsChannel("channel-2");
		NewsChannel observer3 = new NewsChannel("channel-3");

		observable.addObserver(observer1);
		observable.addObserver(observer2);
		observable.addObserver(observer3);
		
		observable.setNews("new news :)");
		System.out.println(observer1.getNews());
		System.out.println(observer2.getNews());
		System.out.println(observer3.getNews());
		
		observable.setNews("new latest hello news :)");
		System.out.println(observer3.getNews());
	}
}
