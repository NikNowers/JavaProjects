package prak2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book d1 = new Book(1, 100);
        Book d2 = new Book(2);
        Book d3 = new Book();
        d3.SetNumb(3);
        d2.SetPages(150);
        d3.SetPages(200);
        d1.library_report();
        d2.library_report();
        d3.library_report();
        d2.hours();
    }
}
