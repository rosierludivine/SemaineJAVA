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
        Client client1 = new Client("Rose", "Claire", "Chemin laurier ", 38150, "Saint Maurice" );
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

        //Affichage client 1
        //le \n permet de sauter un ligne
        System.out.println("\nNom: "+client1.getNom());
        System.out.println("Prenom : "+client1.getPrenom());
        System.out.println("Code Postal : "+client1.getCodePostal());
        System.out.println("Adresse : "+client1.getAdresse());
        System.out.println("Ville : "+client1.getVille());





    }
}
