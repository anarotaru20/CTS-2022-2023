package builder;

public class AsamblareBurger {
    private BurgerBuilder builder;

    public AsamblareBurger(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void buildBurger(BurgerBuilder builder) {
        builder.setTipChifla("alba");
        builder.setCarne("pui");
        builder.setSos("maioneza");
        builder.setLegume("ceapa");
        builder.setCondimente("sare, piper");

    }
}
