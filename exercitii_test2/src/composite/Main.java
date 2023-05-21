package composite;

public class Main {
    public static void main(String[] args) {
        OptiuneMeniu item1 = new ItemMeniu();
        OptiuneMeniu item2 = new ItemMeniu();
        OptiuneMeniu item3 = new ItemMeniu();
        OptiuneMeniu item4 = new ItemMeniu();

        Categorie categorieMicDeJun = new Categorie("Mic dejun");
        categorieMicDeJun.adaugaCategorie(item1);
        categorieMicDeJun.adaugaCategorie(item2);

//        categorieMicDeJun.stergeCategorie(item2);

        Categorie categoriePranz = new Categorie("Pranz");
        categoriePranz.adaugaCategorie(item3);

        Categorie categorieCina = new Categorie("Cina");
        categorieCina.adaugaCategorie(item4);


        categorieMicDeJun.optiune();
        categoriePranz.optiune();
        categorieCina.optiune();


    }
}
