package dec13_21;
abstract class Shape{
	abstract void numberOfSides();
}
 class Rectangle extends Shape{
	 void numberOfSides() {
		 System.out.println("I am Rectangle, i have 4 sides");
	 }
}
 class Triangle extends Shape{
	 void numberOfSides() {
		 System.out.println("I am Triangle, i have 3 sides");
	 }
 }
 class Hexagon extends Shape{
	 void numberOfSides() {
		 System.out.println("I am Hexagon, i have 6 sides");
	 }
 }
public class Abstract_Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Hexagon h=new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
		
	}

}
