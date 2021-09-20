package prak2;
public class TestShape {
    public static void main(String[] args) {
        Shape b1 = new Shape("circle");
        Shape b2 = new Shape();
        b1.toString();
        b2.SetShape("treangle");
        b2.toString();
        System.out.println(b1);
        System.out.println(b2);
    }
}