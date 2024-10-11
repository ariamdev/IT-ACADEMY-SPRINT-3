package n1ex1Builder.Builder;

import n1ex1Builder.Kitchen.Dough;
import n1ex1Builder.Kitchen.Pizza;
import n1ex1Builder.Kitchen.Size;

import java.util.List;

public class PizzaMaster {
    public Pizza cookingPizza(PizzaBuilder pizzaBuilder, Size size, Dough dough, List<String> extraTopping){
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        extraTopping.forEach(pizzaBuilder::addToppings);
        return pizzaBuilder.build();
    }
}
