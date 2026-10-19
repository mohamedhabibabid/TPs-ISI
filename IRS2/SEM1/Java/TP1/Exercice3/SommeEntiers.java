// Necessite Java 25 ou une version recente avec les fichiers source compacts.
void main() {
    String saisie=IO.readln("Donnez N : ");
    int n;

    try {
        n=Integer.parseInt(saisie);
    } catch (NumberFormatException e) {
        IO.println("Veuillez saisir un entier valide.");
        return;
    }

    if(n<1) {
        IO.println("N doit etre superieur ou egal a 1.");
        return;
    }

    long somme=0;
    for(int i=1;i<=n;i++) {
        somme+=i;
    }
    IO.println("Bonjour ! La somme de 1 a " + n + " est " + somme + ".");
}
