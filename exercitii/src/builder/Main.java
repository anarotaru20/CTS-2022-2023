package builder;

public class Main {
    public static void main(String[] args) {

        BurgerBuilder burgerBuilder = new BurgerBuilder();
        AsamblareBurger asamblareBurger = new AsamblareBurger(burgerBuilder);
        asamblareBurger.buildBurger(burgerBuilder);
        Burger burger = burgerBuilder.getBurger();
        System.out.println(burger.toString());
    }
}
