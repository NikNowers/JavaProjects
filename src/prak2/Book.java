package task2;
import java.lang.*;
public class Book {
    private String name;
    private String author;
    private int pages;
    public Book(String b, String c, int d){
        name=b;
        author=c;
        pages=d;
    }
    public Book(String c, int d){
        author=c;
        pages=d;
    }
    public Book(int d,String b){
        name=b;
        pages=d;
    }
    public Book(String b, String c){
        name=b;
        author=c;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void SetAuthor(String author){
        this.author=author;
    }
    public void SetPages(int pages){
        this.pages=pages;
    }
    public String GetName(){
        return name;
    }
    public String GetAuthor(){
        return author;
    }
    public int GetPages(){
        return pages;
    }
    public void library_report(){
        System.out.println("The book "+name+" by "+author+" has "+ pages+" pages");
    }
}
