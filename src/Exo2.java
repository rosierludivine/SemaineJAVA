import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Exo2 {
    // Exercice 2
    //Définition de la  plage
    int max = 1000;
    int min = 1;
    int range = (max - min) + 1;

    // Générer un nombre aléotoire
    int nbr = (int) (Math.random() * range) + min;
    int nbr1 = (int) (Math.random() * range) + min;
    int nbr2 = (int) (Math.random() * range) + min;

    //Initiation compteur
    int nbrTour = 0;

        System.out.println("Nombre aléatoire 1 : "+nbr);
        System.out.println("Nombre aléatoire 2 : "+nbr1);
        System.out.println("Nombre aléatoire 3 : "+nbr2);


            while(nbr %2!=0)

    {
        nbrTour++;
        nbr = (int) (Math.random() * range) + min;
        System.out.println("Nombre aléatoire 1 pour qu'il soit pair: " + nbr);
    }
            while(nbr1 %2!=0)

    {
        nbrTour++;
        nbr1 = (int) (Math.random() * range) + min;
        System.out.println("Nombre aléatoire 2 pour qu'il soit pair: " + nbr1);
    }
    //
            while(nbr2 %2==0)

    {
        nbrTour++;
        nbr2 = (int) (Math.random() * range) + min;
        System.out.println("Nombre aléatoire 3 pour qu'il soit pair: " + nbr2);
    }


            System.out.println("Il y a eu "+nbrTour+" de tour, avant que nous ayons la formule pair pair impair ");
            System.out.println("Voici le nombre "+nbr+" "+nbr1+" "+nbr2);

}
