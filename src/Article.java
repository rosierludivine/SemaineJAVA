public class Article {

    int reference;
    String libelle;
    String name;

    public void pause(){
        System.out.println("Les "+name +" ont été déposé l'article par terre");

    }
    public void libelleRef(){
        System.out.println("L'article "+name +" a comme reference  " + reference+" et sont libelle "+ libelle);
    }
}
