package prak4;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author d1 = new Author("Alex Brody", "alBrody@somewhere.com",'M');
        Author d2 = new Author("Margo Brody", 'F');
        System.out.println(d1);
        System.out.println(d2);
        d2.setEmail("maBrody@somewhere.com");
        d1.toString();
        d2.toString();
        System.out.println(d1);
        System.out.println(d2);
    }
}
