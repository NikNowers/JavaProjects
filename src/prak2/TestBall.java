package prak2;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball d1 = new Ball("small","red");
        Ball d2 = new Ball();
        Ball d3 = new Ball("big");
        d3.SetColour("blue");
        d1.burst();
    }
}