import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Exo1 {
    //Exercice 1
    String[] arrayEmail =
            {
                    "jpp@sfr.fr",
                    "tom@gmail.com",
                    "fred@sfr.fr",
                    "victor@sfr.fr",
                    "chris@sfr.fr",
                    "robert@orange.fr",
                    "paul@sfr.fr",
                    "lise@gmail.com",
                    "thierry@isitech.fr",
                    "marie@isitech.fr"
            };
        System.out.println(arrayEmail[1]);//



    int gmail = 0; // initialisation du compteur gmail
    int sfr = 0 ; // initialisation du compteur
    int orange = 0; // initialisation du compteur
    int isitech = 0; // initialisation du compteur
    int totalMail = arrayEmail.length; // longueur du tableau


    //Tant que i est < a la longueur de array Email
        for ( String email : arrayEmail) {
        //alors

        //si la valuer du tableau fini par @gmail.com
        if (email.endsWith("@gmail.com")) {
            //alors gmail +1
            gmail++;
        }

        else if (email.endsWith("@sfr.fr")){
            sfr++;
        }
        else if (email.endsWith("@isitech.fr")){
            isitech++;
        }
        else if (email.endsWith("@orange.fr")){
            orange++;
        }
    }
    //System.out.println(gmail + " gmail");
    //System.out.println(orange + " orange");
    //System.out.println(sfr + " sfr");
    //System.out.println(isitech +" isitech");

    //Calcule des pourcentages
    double resultatGmail = (double) gmail / totalMail * 100;
        System.out.println("Nombre d'operateur Gmail " + resultatGmail + "%");

    double resultatOrange = (double)orange / totalMail * 100;
        System.out.println("Nombre d'operateur Orange " + resultatOrange + "%");

    double resultatIsitech = (double)isitech / totalMail * 100;
        System.out.println("Nombre d'operateur Isitech " + resultatIsitech + "%");

    double resultatSfr = (double)sfr / totalMail * 100;
        System.out.println("Nombre d'operateur SFR " + resultatSfr + "%");
}
