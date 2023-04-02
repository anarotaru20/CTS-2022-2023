package prototype;

import prototype.fisier.Fisier;
import prototype.fisier.FisierSpecial;
import prototype.fisier.Folder;

public class Main {
    public static void main(String[] args) {
        Fisier file = new Fisier("fisier", "txt", 200);

        Fisier file2 = (Fisier) file.clone();

        file2.setFileSize(400);

//        System.out.println(file.toString());
//        System.out.println("\nFisier copiat");
//        System.out.println(file2.toString());


        Fisier file3 = new FisierSpecial("fisier", "txt", 250, "notepad");
        Fisier file4 = (Fisier) file3.clone();

//        file4.setOpeningProgram("word");
        file4.setFileSize(150);

//        System.out.println("\n");
//        System.out.println(file3.toString());
//        System.out.println("\nFisier Special copiat");
//        System.out.println(file4.toString());

        Folder folder = new Folder();
        folder.adaugaFisier("file", file);

        folder.adaugaFisier("file2", file2);
        folder.adaugaFisier("file2", file3);

        folder.adaugaFisier("file3", file3);
        folder.adaugaFisier("file4", file4);

        System.out.println(folder);
        file.setFileSize(5);
//        folder.alegeFisier("file2").setFileSize(5);
        System.out.println(folder);
        System.out.println(file);


    }
}
