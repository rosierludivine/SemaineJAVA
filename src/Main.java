import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exercice 2
        //Définition de la  plage
        int max = 1000;
        int min = 1;
        int range = (max - min ) +1;

        // Générer un nombre aléotoire
        int nbr = (int)(Math.random() * range) + min;
        int nbr1 = (int)(Math.random() * range) + min;
        int nbr2 = (int)(Math.random() * range) + min;

        //Initiation compteur
        int nbrTour = 0;

        System.out.println("Nombre aléatoire 1 : " + nbr);
        System.out.println("Nombre aléatoire 2 : " + nbr1);
        System.out.println("Nombre aléatoire 3 : " + nbr2);


        while (nbr % 2 != 0)
        {
            while(nbr % 2 != 0){
                nbrTour++;
                nbr = (int)(Math.random() * range) + min;
                System.out.println("Nombre aléatoire 1 pour qu'il soit pair: " + nbr);
            } while (nbr1 % 2 !=0) {
                nbrTour++;
                nbr1 = (int)(Math.random() * range) + min;
                System.out.println("Nombre aléatoire 2 pour qu'il soit pair: " + nbr1);
            } while (nbr2 % 2 == 0) {
            nbrTour++;
            nbr2 = (int)(Math.random() * range) + min;
            System.out.println("Nombre aléatoire 3 pour qu'il soit pair: " + nbr2);
        }

        }
        System.out.println("Il y a eu "+ nbrTour+ " de tour, avant que nous ayons la formule pair pair impair ");

/*       Exercice 1
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

*/




    }
}
