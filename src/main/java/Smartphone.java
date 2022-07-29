public class Smartphone extends Product {

    private String model;
    private int performance;

    public Smartphone(int id, String name, int price, String model, int performance) {
        super(id, name, price);
        this.performance = performance;
        this.model = model;
    }
}
