public class MainClass {
	public static void main(String[] args) {
		
		User robert = new User("Robert");
		User john = new User("John");

		robert.setName("robert new");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}