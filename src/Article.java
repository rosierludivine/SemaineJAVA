
public class Article {
    public String designation;
    private int reference;
    private double prix;

    //Constructeurs
    public Article(){
    }

    public Article (String designation, int reference, int prix){
        this.designation = designation;
        this.prix=prix;
        this.reference=reference;
    }

    //Méthodes
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String nameArticle) {
        this.designation = nameArticle;
    }

    public double getPrix() {
        return prix;
    }
    public int getReference() {
        return reference;
    }
}
