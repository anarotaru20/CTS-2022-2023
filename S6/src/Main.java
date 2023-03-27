import factory.AnimalFactory;
import factory.CatFactory;
import factory.CowFactory;
import factory.DogFactory;
import abstractFactory.GUIFactory;
import abstractFactory.MacGUIFactory;
import abstractFactory.WindowsGUIFactory;
import simpleFactory.PizzaFactory;
import simpleFactory.PizzaType;

public class Main {
    public static void main(String[] args) {

        System.out.println("SIMPLE FACTORY");
        PizzaFactory.createPizza(PizzaType.CHEESE);
        PizzaFactory.createPizza(PizzaType.PEPPERONI);
        PizzaFactory.createPizza(PizzaType.MARGHERITA);

        System.out.println();

        System.out.println("FACTORY");
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory leoFactory = new CowFactory();

        catFactory.createAnimal();
        dogFactory.createAnimal();
        leoFactory.createAnimal();

        System.out.println();

        System.out.println("ABSTRACT FACTORY");
        GUIFactory windowsFactory = new WindowsGUIFactory();
        GUIFactory macFactory = new MacGUIFactory();

        windowsFactory.createButton().design();
        windowsFactory.createMenu().design();

        macFactory.createButton().design();
        macFactory.createMenu().design();

    }

}