public class Smartphone extends Product {

    private String model;

    public String getPerformance() {
        return performance;
    }

    private String performance;

    public Smartphone(int id, String name, int price, String model, String performance) {
        super(id, name, price);
        this.performance = performance;
        this.model = model;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (getPerformance().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
