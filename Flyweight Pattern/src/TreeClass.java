
public class TreeClass implements Tree {
	private int x,y;
	private String color;
	
	TreeClass(String color)
	{
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("tree drawing => color : " + color + " , x : " + x + " , y : " + y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
