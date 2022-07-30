public class Book extends Product {

    private String title;

    public String getAuthor() {
        return author;
    }

    private String author;

    public Book(int id, String name, int price, String title, String author) {
        super(id, name, price);
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (getAuthor().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
