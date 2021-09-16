package task2;

import java.lang.*;
public class Human {
    private String hair;
    private String eyes;
    private int teeth;
    public Human(String b, String c, int d){
        hair=b;
        eyes=c;
        teeth=d;
    }
    public Human(String c, int d){
        eyes=c;
        teeth=d;
    }
    public Human(int d,String b){
        hair=b;
        teeth=d;
    }
    public Human(String b, String c){
        hair=b;
        eyes=c;
    }
    public void SetHair(String hair){
        this.hair=hair;
    }
    public void SetEyes(String eyes){
        this.eyes=eyes;
    }
    public void SetTeeth(int teeth){
        this.teeth=teeth;
    }
    public String GetHair(){
        return hair;
    }
    public String GetEyes(){
        return eyes;
    }
    public int GetTeeth(){
        return teeth;
    }
    public void hospital_report(){
        System.out.println("The human has "+hair+" hair, "+eyes+" eyes and "+ teeth+" teeth");
    }
}