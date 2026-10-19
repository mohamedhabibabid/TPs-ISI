import java.util.Locale;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n=lireNombreTemperatures(scanner);
        double[] temperatures=new double[n];
        double somme=0;
        double minimum=60;
        double maximum=-50;
        int joursGel=0;

        for(int i=0;i<n;i++) {
            temperatures[i]=lireTemperature(scanner, i+1);
            somme+=temperatures[i];
            if(temperatures[i]<minimum) minimum=temperatures[i];
            if(temperatures[i]>maximum) maximum=temperatures[i];
            if(temperatures[i]<0) joursGel++;
        }

        double moyenne=somme/n;
        double sommeEcarts=0;
        for(double temperature : temperatures) {
            double ecart=temperature-moyenne;
            sommeEcarts+=ecart*ecart;
        }

        double[] copie=temperatures.clone();
        trierBulles(copie);
        double mediane=n%2==0 ? (copie[n/2-1]+copie[n/2])/2 : copie[n/2];

        System.out.println("--- Resultats ---");
        System.out.printf("Moyenne     : %.2f °C%n", moyenne);
        System.out.printf("Maximum     : %.2f °C%n", maximum);
        System.out.printf("Minimum     : %.2f °C%n", minimum);
        System.out.printf("Amplitude   : %.2f °C%n", maximum - minimum);
        System.out.printf("Ecart-type  : %.2f%n", Math.sqrt(sommeEcarts / n));
        System.out.printf("Mediane     : %.2f °C%n", mediane);
        System.out.println("Jours de gel : " + joursGel);
        scanner.close();
    }

    private static int lireNombreTemperatures(Scanner scanner) {
        while(true) {
            System.out.print("Combien de temperatures ? ");
            if(scanner.hasNextInt()) {
                int n=scanner.nextInt();
                if(n>=3 && n<=30) return n;
            } else {
                scanner.next();
            }
            System.out.println("Saisissez un entier entre 3 et 30.");
        }
    }

    private static double lireTemperature(Scanner scanner, int numero) {
        while(true) {
            System.out.print("Temperature " + numero + " : ");
            if(scanner.hasNextDouble()) {
                double valeur=scanner.nextDouble();
                if(valeur>=-50 && valeur<=60) return valeur;
            } else {
                scanner.next();
            }
            System.out.println("La temperature doit etre comprise entre -50 et 60.");
        }
    }

    private static void trierBulles(double[] valeurs) {
        for(int fin=valeurs.length-1;fin>0;fin--) {
            for(int i=0;i<fin;i++) {
                if(valeurs[i]>valeurs[i+1]) {
                    double temporaire=valeurs[i];
                    valeurs[i]=valeurs[i+1];
                    valeurs[i+1]=temporaire;
                }
            }
        }
    }
}
