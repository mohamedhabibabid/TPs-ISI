public class Main {
    public static void main(String[] args) {
        Banque banque=new Banque(10);
        CompteBancaire compte1=new CompteBancaire("C001", "Amira Ben Ali");
        CompteBancaire compte2=new CompteBancaire("C002", "Youssef Trabelsi");
        banque.ouvrirCompte(compte1);
        banque.ouvrirCompte(compte2);

        compte1.deposer(500);
        banque.effectuerVirement("C001", "C002", 125.5);
        banque.afficherTousLesComptes();
    }
}
