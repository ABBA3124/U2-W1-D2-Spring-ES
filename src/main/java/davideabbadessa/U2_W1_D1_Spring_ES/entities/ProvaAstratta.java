package davideabbadessa.U2_W1_D1_Spring_ES.entities;

public abstract class ProvaAstratta {
    private String name;
    private double price;
    private int calorie;

    public ProvaAstratta(String name, double price, int calorie) {
        this.name = name;
        this.price = price;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return name +
                ", Calorie: " + calorie + " kcal" +
                ", Prezzo: " + price + "€";
    }
}
