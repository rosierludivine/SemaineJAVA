/*
import java.util.Random;
import java.util.Scanner;

public class Exo3 {

    //Méthode main point entrée de notre programme java
    public static void main(String[] args) {
        ///Exercice 3

        //number instance de classe (un object )
        //Creation d'un nombre aléatoire
        Random number = new Random();

        //nextInt permet de de mettre le parametre de grandeur
        int devineNombre = number.nextInt(101);

        // Petit test
        //System.out.println(devineNombre);

        //initialisation de la valeur entre par l'utilisateur
        int valueInput = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un premier entier : ");
        //Premiere valeur de l'utilisateur
        valueInput = scanner.nextInt();

        while (valueInput != devineNombre) {
            //Tant que la  valeur entré nest pas le nombre a deviner

            if (valueInput < devineNombre) {
                //Si la valeur entré est plus petite que le nombre
                // Alors affichage de "le nombre a deviner est plus grand
                System.out.println("Le nombre a deviner est plus grand");
                System.out.print("Veuillez saisir un premier entier : ");
                valueInput = scanner.nextInt();

            } else if (valueInput > devineNombre) {
                // Si la valeur est plus grand que le nombre
                //alors affichage de "Le nombre a deviner est plus petit
                System.out.println("Le nombre a deviner est plus petit ");
                System.out.print("Veuillez saisir un premier entier : ");
                valueInput = scanner.nextInt();
            }

        }
        //Commentaire de fin vous avez reussi
        System.out.println("Bravo le chiffre était bien " + devineNombre);


    }
}
*/
