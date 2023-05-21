package facade;

public class CompanieAeriana {
    private String name;

    public CompanieAeriana(String name) {
        this.name = name;
    }

    public void getCompanieAeriana() {
        System.out.println("Companie aeriana: " + name);
    }
}
