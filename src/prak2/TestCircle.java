package task2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue"); // Use 3rd constructor
        System.out.println("Radius is " + c1.getRadius() + " Color is " + c1.getColor() + ".     Area is " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius is " + c2.getRadius() + " Color is " + c2.getColor() + ". Area is " + c2.getArea());

        Circle c3 = new Circle(); // Use 1st constructor
        System.out.println("Radius is " + c3.getRadius() + " Color is " + c3.getColor() + ". Area is " + c3.getArea());
    }
}
