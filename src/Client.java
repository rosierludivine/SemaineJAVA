/*Exercice 6
Créer une classe représentant un client d’un magasin de vente par en ligne.
Un client est caractérisé par son nom, son prénom, son adresse, son code postal et sa ville.
Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.
*/
public class Client {
    private String nom;
    public  String prenom;

    protected String adresse;
    private int codePostal;
    private String ville;

    //Constructeurs
    public Client(){

    }

    public Client(String nom, String prenom, String adresse, int codePostal, String ville){
        this.nom = nom ;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville ;
    }

    //Methodes
    public String getNom(){
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}