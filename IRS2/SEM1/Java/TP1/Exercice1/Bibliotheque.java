public class Bibliotheque {
    private final Livre[] livres;
    private int nombreLivres;

    public Bibliotheque(int capacite) {
        livres=new Livre[capacite];
    }

    public boolean ajouterLivre(Livre livre) {
        if(nombreLivres==livres.length) {
            System.out.println("La bibliotheque est pleine.");
            return false;
        }
        livres[nombreLivres++]=livre;
        return true;
    }

    public boolean emprunterLivre(String isbn) {
        for(int i=0;i<nombreLivres;i++) {
            if(livres[i].getIsbn().equals(isbn)) {
                return livres[i].emprunter();
            }
        }
        return false;
    }

    public void afficherLivresDisponibles() {
        System.out.println("Livres disponibles :");
        for(int i=0;i<nombreLivres;i++) {
            if(livres[i].isDisponible()) {
                System.out.println("- " + livres[i]);
            }
        }
    }
}
