import java.util.Scanner;
public class MethodOverload {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of the triangle:");
		float base = sc.nextFloat();
		System.out.println("Enter the Height of the triangle:");
		float height = sc.nextFloat();
		System.out.println("Enter the Width of the Rectangle");
		int recwidth = sc.nextInt();
		System.out.println("Enter the Height of the Rectangle ");
		int recheight = sc.nextInt();
		System.out.println("Enter the Radius of the Circle");
		float radius = sc.nextFloat();
		Shapes shape = new Shapes();
		shape.Area(base,height);
		shape.Area(recwidth,recheight);
		shape.Area(radius);
		}
	}
class Shapes {
	public void Area(float radius) {
		double area = 3.14*radius*radius;
		System.out.println("Area of circle with radius "+radius+" is "+area);
	}
	public void Area(float base, float height) {
		double area = 0.5*base*height;
		System.out.println("Area of triangle is "+area);
	}
	public void Area(int width, int height) {
		int area = width*height;
		System.out.println("Area of rectangle is "+area);
	}
}
