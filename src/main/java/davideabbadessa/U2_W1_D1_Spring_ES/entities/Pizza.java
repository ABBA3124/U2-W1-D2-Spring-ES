package davideabbadessa.U2_W1_D1_Spring_ES.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ProvaAstratta {
    private List<Topping> toppings;

    public Pizza(String name, double price, int calorie) {
        super(name, price, calorie);
        this.toppings = new ArrayList<>();
    }

    public void aggiungiTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }
}
