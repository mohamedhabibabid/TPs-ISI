// Necessite Java 25 : Flexible Constructor Bodies.
public class Produit {
    private final double prix;
    private final String nom;

    public Produit(String nom, double prix) {
        if(prix<=0) {
            throw new IllegalArgumentException("Le prix doit etre strictement positif.");
        }
        super();
        this.nom=nom;
        this.prix=prix;
    }

    public Produit(double prix) {
        this("Produit sans nom", prix);
    }

    @Override
    public String toString() {
        return nom + " : " + prix + " DT";
    }
}
