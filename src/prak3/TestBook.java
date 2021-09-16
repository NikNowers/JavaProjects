package prak3;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book d1 = new Book("Преступление и наказание","Достоевский Ф.М.", 670);
        Book d2 = new Book("Гончаров И.А.", 635);
        Book d3 = new Book(319, "Портрет Дориана Грея");
        Book d4 = new Book("Убийство в Восточном экспрессе","Агата Кристи");
        d2.SetName("Обломов");
        d3.SetAuthor("Оскар Уайльд");
        d4.SetPages(317);
        d1.library_report();
        d2.library_report();
        d3.library_report();
        d4.library_report();
    }
}