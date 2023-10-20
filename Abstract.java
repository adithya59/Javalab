
public class Abstract {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		Hexagon hex = new Hexagon();
		rec.numberOfSides();
		tri.numberOfSides();
		hex.numberOfSides();
	}

}
abstract class Shape {
	abstract void numberOfSides();
}
class Rectangle extends Shape {
	void numberOfSides() {
		System.out.println("Rectangle has 4 sides.");
	}
}
class Triangle extends Shape {
	void numberOfSides() {
		System.out.println("Triangle has 3 sides.");
	}
}
class Hexagon extends Shape {
	void numberOfSides() {
		System.out.println("Hexagon has 6 sides.");
	}
}