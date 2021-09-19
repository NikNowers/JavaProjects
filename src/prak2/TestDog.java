package prak2;
import java.lang.*;
public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog(2,"Mike");
        Dog d2 = new Dog(7,"Helen");
        Dog d3 = new Dog("Bob");
        d3.SetAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d2.Woofing();
    }
}
