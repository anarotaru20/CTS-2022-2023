package prototype.fisier;

import java.util.HashMap;
import java.util.Map;

public class Folder {
    Map<String, Fisier> fisiere = new HashMap<>();

    public void adaugaFisier(String nume, Fisier fisier) {
        fisiere.put(nume, (Fisier) fisier.clone());
    }

    public Fisier alegeFisier(String nume) {
        return fisiere.get(nume);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "fisiere=" + fisiere +
                '}';
    }
}
