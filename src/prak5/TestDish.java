package prak5;

public class TestDish {
    public static void main(String[] args) {

        Plate b1 = new Plate();
        Cutlery b2 = new Cutlery();
        b1.setColor("white");
        b2.setColor("silver");
        b1.setMaterial("keramic");
        b2.setMaterial("silver");
        b1.shine();
        b2.shine();
        b1.brake();
        b2.brake();
    }
}
