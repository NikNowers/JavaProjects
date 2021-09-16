package Lab11;
import java.lang.*;
public class Dog {
    private int age;
    private String name;
    public Dog(int n, String m){
        age=n;
        name=m;
    }
    public Dog(String m){
        age=0;
        name=m;
    }
    public Dog(){
        age=0;
        name="Pup";
    }
    public void SetAge(int age){
        this.age=age;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
    public void Woofing() {
        System.out.println(name + "'s woofing");
    }
}
