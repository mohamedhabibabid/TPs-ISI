public class Banque {
    private final CompteBancaire[] comptes;
    private int nombreComptes;

    public Banque(int capacite) {
        comptes=new CompteBancaire[capacite];
    }

    public boolean ouvrirCompte(CompteBancaire compte) {
        if(nombreComptes==comptes.length || rechercherCompte(compte.getNumeroCompte())!=null) {
            return false;
        }
        comptes[nombreComptes++]=compte;
        return true;
    }

    public CompteBancaire rechercherCompte(String numeroCompte) {
        for(int i=0;i<nombreComptes;i++) {
            if(comptes[i].getNumeroCompte().equals(numeroCompte)) {
                return comptes[i];
            }
        }
        return null;
    }

    public boolean effectuerVirement(String numSource, String numDest, double montant) {
        CompteBancaire source=rechercherCompte(numSource);
        CompteBancaire destination=rechercherCompte(numDest);
        if(source==null || destination==null || source==destination || montant<=0) {
            return false;
        }
        if(!source.retirer(montant)) {
            return false;
        }
        destination.deposer(montant);
        return true;
    }

    public void afficherTousLesComptes() {
        for(int i=0;i<nombreComptes;i++) {
            System.out.printf("%s (%s) : %.2f DT%n", comptes[i].getNumeroCompte(),
                    comptes[i].getTitulaire(), comptes[i].getSolde());
        }
    }
}
