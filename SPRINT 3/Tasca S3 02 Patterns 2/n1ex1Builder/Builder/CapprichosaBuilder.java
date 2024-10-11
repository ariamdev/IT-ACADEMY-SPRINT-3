package n1ex1Builder.Builder;

import n1ex1Builder.Kitchen.Dough;
import n1ex1Builder.Kitchen.Pizza;
import n1ex1Builder.Kitchen.Size;
import n1ex1Builder.Kitchen.Topping;

import java.util.ArrayList;
import java.util.List;

public class CapprichosaBuilder implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public CapprichosaBuilder() {
        toppings.add(new Topping("Tomato sauce"));
        toppings.add(new Topping("Ham"));
        toppings.add(new Topping("Artichoke"));
        toppings.add(new Topping("Olives"));
        toppings.add(new Topping("Mushrooms"));
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void addToppings(String topping) {
        toppings.add(new Topping(topping));
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}
