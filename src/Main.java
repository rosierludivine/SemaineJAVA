import java.util.Scanner;
import java.util.stream.IntStream;
/*
Exercice 5
Créer une classe représentant un article d’un magasin de vente par en ligne.
Un article est caractérisé par sa référence, sa désignation, son prix.
Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

Exercice 6
Créer une classe représentant un client d’un magasin de vente par en ligne. Un client est caractérisé par son nom, son prénom, son adresse, son code postal et sa ville.
Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

Exercice 7
Créer une classe représentant une commande d’un magasin de vente par en ligne.
Une commande est caractérisée par son numéro,sa date,le client qui passe la commande,le tableau des articles commandés et le tableau des quantités commandées pour chaque article.
Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.
 */
public class Main {
    //Méthode main point entrée de notre programme java
    public static void main(String[] args) {
        String nameArticle = null ;
        //création d'un article en dur
        Article article1 = new Article("pommes", 1234, 12 );

        //Demande du nom de l'article
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer le nom de l'article1 ");
        nameArticle = scanner.next();
        //Changez le nom de l'article grace au setter
        article1.setDesignation(nameArticle);

        //Affichage article 1
        System.out.println("Nom: "+article1.getDesignation());
        System.out.println("Réference : "+article1.getReference());
        System.out.println("Prix : "+article1.getPrix());




    }
}
