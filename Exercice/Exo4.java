import java.util.Scanner;

public class Exo4 {
    ///Exercice 4

    int valueInput = 0;

    Scanner scanner = new Scanner(System.in);
        System.out.print( "Veuillez saisir un entier : " );
    valueInput = scanner.nextInt();
        System.out.println( "Voici la valeur que vous avez entré " +valueInput );

    //Conversion de entier en binaire
    // Integer.toBinaryString Renvoie le binaire de l'entier entré
    String binary = Integer.toBinaryString(valueInput);
        System.out.println("Voici le nombre en binaire "+binary);

    //Conversion en toOctalString
    String octal = Integer.toOctalString(valueInput);
        System.out.println("Voici le nombre en octal "+octal);

    //Conversion en hexadecimal toHexString
    String hexadecimal = Integer.toHexString(valueInput);
        System.out.println("Voici le nombre en hexadecimal "+hexadecimal);


}
