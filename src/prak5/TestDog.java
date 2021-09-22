package prak5;

public class TestDog {
    public static void main(String[] args) {

        Doberman d1 = new Doberman();
        Chihuahua d2 = new Chihuahua();
        d1.setColor("black");
        d2.setColor("ginger");
        d1.woofing();
        d2.woofing();
    }
}
