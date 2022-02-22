public class Drink extends Item{
    private boolean alcoholic;
    private boolean withExtraWater;

    public Drink(String name, boolean available,Double price, boolean alcoholic, boolean withExtraWater) {
        super(name, available,price);
        this.alcoholic = alcoholic;
        this.withExtraWater = withExtraWater;
    }

    public Drink(boolean alcoholic, boolean withExtraWater) {
        this.alcoholic = alcoholic;
        this.withExtraWater = withExtraWater;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public boolean isWithExtraWater() {
        return withExtraWater;
    }

    public void setWithExtraWater(boolean withExtraWater) {
        this.withExtraWater = withExtraWater;
    }
}
