package prak2;
import java.lang.*;
public class Ball {
    private String size;
    private String colour;
    public Ball(String n, String m){
        size=n;
        colour=m;
    }
    public Ball(String n){
        size=n;
        colour="none";
    }
    public Ball(){
        size="none";
        colour="none";
    }
    public void SetSize(String size){
        this.size=size;
    }
    public void SetColour(String colour){
        this.colour=colour;
    }
    public String GetSize(){
        return size;
    }
    public String GetColour(){
        return colour;
    }
    public void store_report(){
        System.out.println("Ball is "+size+" and "+colour+" colour");
    }
    public void burst(){
        System.out.println(colour+"'s ball is burst");
    }
}
