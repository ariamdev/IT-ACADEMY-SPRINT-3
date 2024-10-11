package n1ex1Builder.Kitchen;

import n1ex1Builder.Builder.*;
import n1ex1Builder.Builder.VegetarianBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitchen {
    static Scanner sc = new Scanner(System.in);
    private PizzaMaster pizzaMaster = new PizzaMaster();

    public void kitchenOrder() {
        int opt;
        System.out.println("Select the pizza: \n" +
                "1. Capprichosa.\n" +
                "2. Carbonara.\n" +
                "3. Margherita.\n" +
                "4. Pepperoni.\n" +
                "5. Vegetarian.");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                bakeCapprichosa();
                String pizzaName;
                break;
            case 2:
                bakeCarbonara();
                break;
            case 3:
                bakeMargherita();
                break;
            case 4:
                bakePepperoni();
                break;
            case 5:
                bakeVegetarian();
                break;
            default:
                System.out.println("Please select between the 4 pizzas.");
        }
        System.out.println("Making the pizza....\n" +
                "Baking the pizza in the oven...\n" +
                "Your pizza is ready! \n");
    }

    public Size chooseSize(){
        Size size = null;
        boolean valid = false;

        do {
            System.out.println("Choose a size (SMALL, MEDIUM, LARGE):");
            String selectedSize = sc.next();

            if (selectedSize.equalsIgnoreCase("SMALL")) {
                size = Size.SMALL;
                valid = true;
            } else if (selectedSize.equalsIgnoreCase("MEDIUM")) {
                size = Size.MEDIUM;
                valid = true;
            } else if (selectedSize.equalsIgnoreCase("LARGE")) {
                size = Size.LARGE;
                valid = true;
            } else {
                System.out.println("Invalid size, please select between the options.");
            }
        } while (!valid);

        return size;
    }

    public Dough chooseDough() {
        Dough dough = null;
        boolean valid = false;

        do {
            System.out.println("Choose a dough (THIN, CLASSIC, DOUBLE):");
            String doughInput = sc.next();

            if (doughInput.equalsIgnoreCase("THIN")) {
                dough = Dough.THIN;
                valid = true;
            } else if (doughInput.equalsIgnoreCase("CLASSIC")) {
                dough = Dough.CLASSIC;
                valid = true;
            } else if (doughInput.equalsIgnoreCase("DOUBLE")) {
                dough = Dough.DOUBLE;
                valid = true;
            } else {
                System.out.println("Invalid dough type, select between the options.");
            }
        } while (!valid);

        return dough;
    }

    private List<String> chooseExtraToppings() {
        List<String> extraToppings = new ArrayList<>();
        System.out.println("Do you want to add extra toppings? (yes/no)");
        String answer = sc.next();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter the topping:");
            extraToppings.add(sc.next());
            System.out.println("Do you want to add another topping? (yes/no)");
            answer = sc.next();
        }

        return extraToppings;
    }

    public void bakeCapprichosa(){
        CapprichosaBuilder capprichosaBuilder = new CapprichosaBuilder();
        Size size = chooseSize();
        Dough dough = chooseDough();
        List<String> extraToppings = chooseExtraToppings();
        Pizza pizza = pizzaMaster.cookingPizza(capprichosaBuilder,size,dough,extraToppings);
        System.out.println("Order: Capprichosa pizza " + pizza);
    }

    public void bakeCarbonara(){
        CarbonaraBuilder carbonaraBuilder = new CarbonaraBuilder();
        Size size = chooseSize();
        Dough dough = chooseDough();
        List<String> extraToppings = chooseExtraToppings();
        Pizza pizza = pizzaMaster.cookingPizza(carbonaraBuilder,size,dough,extraToppings);
        System.out.println("Order: Carbonara pizza " + pizza);
    }

    public void bakeMargherita(){
        MargheritaBuilder margheritaBuilder = new MargheritaBuilder();
        Size size = chooseSize();
        Dough dough = chooseDough();
        List<String> extraToppings = chooseExtraToppings();
        Pizza pizza = pizzaMaster.cookingPizza(margheritaBuilder,size,dough,extraToppings);
        System.out.println("Order: Margherita pizza " + pizza);
    }

    public void bakePepperoni(){
        PepperoniBuilder pepperoniBuilder = new PepperoniBuilder();
        Size size = chooseSize();
        Dough dough = chooseDough();
        List<String> extraToppings = chooseExtraToppings();
        Pizza pizza = pizzaMaster.cookingPizza(pepperoniBuilder,size,dough,extraToppings);
        System.out.println("Order: Pepperoni pizza " + pizza);
    }

    public void bakeVegetarian(){
        VegetarianBuilder vegetarianBuilder = new VegetarianBuilder();
        Size size = chooseSize();
        Dough dough = chooseDough();
        List<String> extraToppings = chooseExtraToppings();
        Pizza pizza = pizzaMaster.cookingPizza(vegetarianBuilder,size,dough,extraToppings);
        System.out.println("Order: Vegetarian pizza " + pizza);
    }
}
