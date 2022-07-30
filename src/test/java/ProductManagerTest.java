import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void addProd() {
        Book book1 = new Book(1, "book", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Product[] expected = {book1, smartphone1};
        Product[] actual = repo.getAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findName() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Product[] expected = {smartphone1};
        Product[] actual = manager.searchBy("Samsung");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void notFindName() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Pool");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findTwoProd() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Book book2 = new Book(3, "Samsung", 150_500, "Guid for samsung", "Samsung Company");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);

        Product[] expected = {smartphone1, book2};
        Product[] actual = manager.searchBy("Samsung");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNameBook() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = true;
        Boolean actual = manager.matches(book1, "Translate");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void findAuthorBook() {
        Product book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Product smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = true;
        Boolean actual = manager.matches(book1,"Dr Martin");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void findNameSmartfone() {
        Product book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Product smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = true;
        Boolean actual = manager.matches(smartphone1,"Samsung");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findPerfomanceSmartfone() {
        Product book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Product smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = true;
        Boolean actual = manager.matches(smartphone1,"China");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void notFindNameBook() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = false;
        Boolean actual = manager.matches(book1,"PooL");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notFindNameSmartphone() {
        Book book1 = new Book(1, "Translate", 250, "New House", "Dr Martin");
        Smartphone smartphone1 = new Smartphone(2, "Samsung", 50_500, "Silver", "China");
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(smartphone1);

        Boolean expected = false;
        Boolean actual = manager.matches(smartphone1,"PooL");
        Assertions.assertEquals(expected, actual);
    }




}
