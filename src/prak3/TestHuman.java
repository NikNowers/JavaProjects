package prak3;

import java.lang.*;
public class TestHuman {
    public static void main(String[] args){
        Human d1 = new Human("brown","green", 30);
        Human d2 = new Human("blue", 33);
        Human d3 = new Human(20, "pink");
        Human d4 = new Human("blue","red");
        d2.SetHair("red");
        d3.SetEyes("golden");
        d4.SetTeeth(0);
        d1.hospital_report();
        d2.hospital_report();
        d3.hospital_report();
        d4.hospital_report();
    }
}