public class Item {
    private String name;
    private boolean available;
    private double price;
    private Typ typ;

    public Item(String name, boolean available,double price, Typ typ) {
        this.name = name;
        this.available = available;
        this.price = price;
        this.typ = typ;
    }

    public Item() {
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", available=" + available +
                ", price=" + price +
                ", typ=" + typ +
                '}';
    }
}
