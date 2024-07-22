
public class MainClass {

	public static void main(String[] args) {
		
		//when getFactory is getting "shape", ShapeFactory object is created and stored in sf
		AbstractFactory sf = FactoryProducer.getFactory("shape");
		Shape s1 = sf.getShape("circle");
		s1.draw();
		s1 = sf.getShape("rectangle");
		s1.draw();
		
		//now making "color" object by passing string "color" to sf (reference of AbstractFactory type)
		sf = FactoryProducer.getFactory("color");
		Color c1 = sf.getColor("red");
		c1.fill();
		c1 = sf.getColor("blue");
		c1.fill();
	}

}
