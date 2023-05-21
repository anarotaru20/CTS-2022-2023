package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneMeniu{
    private String numeCategorie;
    private List<OptiuneMeniu> optiuniMeniu = new ArrayList<>();

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }

    public void adaugaCategorie(OptiuneMeniu optiuneMeniu) {
        optiuniMeniu.add(optiuneMeniu);
    }
    public void stergeCategorie(OptiuneMeniu optiuneMeniu) {
        optiuniMeniu.remove(optiuneMeniu);
    }

    @Override
    public void optiune() {
        System.out.println(numeCategorie);
        for(OptiuneMeniu optiuneMeniu : optiuniMeniu) {
            optiuneMeniu.optiune();
        }
    }
}
