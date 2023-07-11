import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    //Méthode main point entrée de notre programme java
    public static void main(String[] args) {
            Article article1 = new Article();

            //Afficher les noms
        article1.name = "pommes";
        System.out.println("article 1 : "+article1.name);


        article1.pause();
    }
}
