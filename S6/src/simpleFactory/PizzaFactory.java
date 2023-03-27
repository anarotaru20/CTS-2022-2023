package simpleFactory;

public class PizzaFactory {

    public static Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case MARGHERITA:
                pizza = new MargheritaPizza();
                break;
            default:
                return null;

        }
        return pizza;


    }
}
