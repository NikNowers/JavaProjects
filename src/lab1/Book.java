package Lab13;
import java.lang.*;
public class Book {
    private int numb;
    private int pages;
    public Book(int a, int b){
        numb=a;
        pages=b;
    }
    public Book(int a){
        numb=a;
        pages=0;
    }
    public Book(){
        numb=0;
        pages=0;
    }
    public void SetNumb(int numb){
        this.numb=numb;
    }
    public void SetPages(int pages){
        this.pages=pages;
    }
    public int GetNumb(int numb){
        return numb;
    }
    public int GetPages(int pages){
        return pages;
    }
    public void library_report(){
        System.out.println("The book №"+numb+" has "+ pages+" pages");
    }
    public void hours(){
        System.out.println("The book №"+numb+" was read in "+pages/50+" hours");
    }
}
