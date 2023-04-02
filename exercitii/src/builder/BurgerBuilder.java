package builder;

public class BurgerBuilder {
    private Burger burger;

    public BurgerBuilder() {
        burger = new Burger();
    }

    public BurgerBuilder setTipChifla(String tipChifla) {
        burger.setTipChifla(tipChifla);
        return this;
    }

    public BurgerBuilder setCarne(String carne) {
        burger.setCarne(carne);
        return this;
    }

    public BurgerBuilder setSos(String sos) {
        burger.setSos(sos);
        return this;
    }

    public BurgerBuilder setLegume(String legume) {
        burger.setLegume(legume);
        return this;
    }

    public BurgerBuilder setCondimente(String condimente) {
        burger.setCondimente(condimente);
        return this;
    }

    public Burger getBurger() {
        return burger;
    }

}
