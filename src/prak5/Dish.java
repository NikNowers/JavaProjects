package prak5;

public abstract class Dish {

    private String material;
    private String color;

    public void shine(){
        System.out.println("Посуда сияет!");
    };

    public abstract void brake();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
