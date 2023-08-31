import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création de 3 objets Secretaire
        Secretaire s1 = new Secretaire("NomS1", "PrenomSec1", "AdresseSec1", 1);
        Secretaire s2 = new Secretaire("NomS2", "PrenomSec2", "AdresseSec2", 2);
        Secretaire s3 = new Secretaire("NomS3", "PrenomSec3", "AdresseSec3", 3);
        // Création de 2 objets Enseignant
        Enseignant en1 = new Enseignant("NomEns1", "PrenomEns1", "AdresseEns1", "OOP");
        Enseignant en2 = new Enseignant("NomEns2", "PrenomEns2", "AdresseEns2", "Python");
        // Création de 5 objets Etudiant
        Etudiant et1 = new Etudiant("NomEtu1", "PrenomEtu1", "AdresseEtu1","Software Engineering");
        Etudiant et2 = new Etudiant("NomEtu2", "PrenomEtu2", "AdresseEtu2","Software Engineering");
        Etudiant et3 = new Etudiant("NomEtu3", "PrenomEtu3", "AdresseEtu3","Data Science");
        Etudiant et4 = new Etudiant("NomEtu4", "PrenomEtu4", "AdresseEtu4","Data Science");
        Etudiant et5 = new Etudiant("NomEtu5", "PrenomEtu5", "AdresseEtu5","Software Engineering");

        System.out.println("Afficher l'effectif de l'établissement :");
        Personne.afficherEffectif();

        ArrayList<Personne> listePersonnes = new ArrayList<Personne>(Arrays.asList(s1,s2,s3, en1, en2, et1, et2, et3, et4, et5));

        System.out.println("Liste des personnes : ");
        for (Personne p: listePersonnes) {
            System.out.println(p);
            System.out.println("*******************");
        }

        System.out.println("Recherche des étudiants par diplome : ");
        System.out.println("Diplome : ");
        Scanner sc = new Scanner(System.in);
        String diplome = sc.nextLine();

        for (Personne p: listePersonnes) {
            if (p.getCategorie().equals("Etudiant"))
            {
                Etudiant etu = (Etudiant)p;
                if (etu.getDiplome().equalsIgnoreCase(diplome)) {
                    System.out.println(etu);
                    System.out.println("**********************");
                }
            }
        }

    }
}