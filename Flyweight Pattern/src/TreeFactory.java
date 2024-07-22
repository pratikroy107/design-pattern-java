import java.util.HashMap;

public class TreeFactory {
	public static final HashMap<String, TreeClass> treeMap = new HashMap<String, TreeClass>();
	 
	public static TreeClass getTree(String color) {
		TreeClass tr = (TreeClass)treeMap.get(color);
		if(tr == null) {
			tr = new TreeClass(color);
			treeMap.put(color, tr);
			System.out.println("creating tree of color : " + color);
		}
		return tr;
	}
}
