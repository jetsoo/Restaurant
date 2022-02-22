public class Food extends Item{
    private boolean vegeterian;
    private boolean cooked;

    public Food(String name, boolean available,double price, boolean vegeterian, boolean cooked) {
        super(name, available,price );
        this.vegeterian = vegeterian;
        this.cooked = cooked;
    }

    public Food(boolean vegeterian, boolean cooked) {
        this.vegeterian = vegeterian;
        this.cooked = cooked;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }
}
