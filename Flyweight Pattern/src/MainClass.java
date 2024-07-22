
public class MainClass {

	private static final String colors[] = { "Red", "Green"};

	// here we are creating Tree of a specific color & assigning x,y to it.
	//if that color exists then x,y will be modified.
	//else that color's object will be created and x,y will be assigned to it.
	//intrinsic -> color
	//extrinsic -> x,y (location)
	
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			TreeClass tc = TreeFactory.getTree(getRandomColor());
			tc.setX(getRandomX());
			tc.setY(getRandomY());
			tc.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
