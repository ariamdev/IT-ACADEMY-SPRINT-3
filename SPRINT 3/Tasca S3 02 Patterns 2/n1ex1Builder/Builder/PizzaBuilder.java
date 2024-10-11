package n1ex1Builder.Builder;

import n1ex1Builder.Kitchen.Dough;
import n1ex1Builder.Kitchen.Pizza;
import n1ex1Builder.Kitchen.Size;

public interface PizzaBuilder {
    public void setSize(Size size);
    public void setDough(Dough dough);
    public void addToppings(String toppings);
    Pizza build();
}
