import java.util.List;
import java.util.stream.Gatherers;

public class EtudiantsAdmis {
    public static void main(String[] args) {
        List<Student> etudiants=List.of(
                new Student("Amina", 14.5),
                new Student("Karim", 9.75),
                new Student("Sana", 10.0),
                new Student("Mehdi", 7.5),
                new Student("Rim", 16.25));

        System.out.println("Sans Stream :");
        afficherAdmisSansStream(etudiants);

        System.out.println("\nAvec Stream et Gatherers :");
        etudiants.stream()
                .filter(etudiant -> etudiant.average() >= 10.0)
                .gather(Gatherers.windowFixed(2))
                .forEach(groupe -> {
                    for(Student etudiant : groupe) {
                        afficherAdmission(etudiant);
                    }
                });
    }

    private static void afficherAdmisSansStream(List<Student> etudiants) {
        for(Student etudiant : etudiants) {
            if(etudiant.average()>=10.0) {
                afficherAdmission(etudiant);
            }
        }
    }

    private static void afficherAdmission(Student etudiant) {
        Object valeur=etudiant;
        if(valeur instanceof Student(String nom, double moyenne)) {
            System.out.printf("L'etudiant %s est admis avec une moyenne de %.2f/20.%n", nom, moyenne);
        }
    }
}
