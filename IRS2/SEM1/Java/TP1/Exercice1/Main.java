public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque=new Bibliotheque(5);
        bibliotheque.ajouterLivre(new Livre("L'Etranger", "Albert Camus", "978-2070360024"));
        bibliotheque.ajouterLivre(new Livre("1984", "George Orwell", "978-2070368228"));
        bibliotheque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupery", "978-2070612758"));

        bibliotheque.emprunterLivre("978-2070368228");
        bibliotheque.afficherLivresDisponibles();
    }
}
