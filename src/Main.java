import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    //Méthode main point entrée de notre programme java
    public static void main(String[] args) {
            Article article1 = new Article();

            //Afficher les noms
        //Lui passer les parametres
        article1.name = "pommes";
        article1.reference = 29485223;
        article1.libelle= "pommes de type 1 ";

        //Affichage des information de l'article
        //System.out.println("article 1 : "+article1.name);


        //Affichage de la méthode pause
        article1.pause();
        article1.libelleRef();
    }
}
