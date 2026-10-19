public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible=true;

    public Livre(String titre, String auteur, String isbn) {
        this.titre=titre;
        this.auteur=auteur;
        this.isbn=isbn;
    }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre=titre; }
    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur=auteur; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn=isbn; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible=disponible; }

    public boolean emprunter() {
        if(!disponible) {
            return false;
        }
        disponible=false;
        return true;
    }

    public void retourner() {
        disponible=true;
    }

    @Override
    public String toString() {
        return titre + " - " + auteur + " (ISBN : " + isbn + ") - "
                + (disponible ? "disponible" : "emprunte");
    }
}
