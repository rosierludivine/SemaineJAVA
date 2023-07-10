import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Dalton temel = Dalton.JACK;
        System.out.println(temel.toString());
        System.out.println(temel);
        Dalton data = Dalton.valueOf("Jack");


    }
}
 enum Dalton
{
    JOE (1.48, 52),
    WILLIAM (1.68, 72),
    JACK (1.93, 83),
    AVERELL (2.13, 89);


    private final double taille;
    private final double poids;
    private Dalton(double taille, double poids)

    {
        this.taille taille;
        this.poids poids;
    }
    public double taille() { return taille; }
    public double poids() { return poids; }
    double inc()
    {
        return poids/(taille taille);
    }
}