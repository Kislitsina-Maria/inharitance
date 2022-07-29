public class Book extends Product {

    private String titel;
    private String author;

    public Book(int id, String name, int price, String titel, String author) {
        super(id, name, price);
        this.author = author;
        this.titel = titel;
    }


}
