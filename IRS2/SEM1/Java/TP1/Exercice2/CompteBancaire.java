public class CompteBancaire {
    private final String numeroCompte;
    private final String titulaire;
    private double solde;

    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte=numeroCompte;
        this.titulaire=titulaire;
        solde=0;
    }

    public boolean deposer(double montant) {
        if(montant<=0) {
            return false;
        }
        solde+=montant;
        return true;
    }

    public boolean retirer(double montant) {
        if(montant<=0 || montant>solde) {
            return false;
        }
        solde-=montant;
        return true;
    }

    public void afficherSolde() {
        System.out.printf("Compte %s : %.2f DT%n", numeroCompte, solde);
    }

    public String getNumeroCompte() { return numeroCompte; }
    public String getTitulaire() { return titulaire; }
    public double getSolde() { return solde; }
}
