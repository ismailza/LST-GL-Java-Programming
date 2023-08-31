package TP3.Ex4;

public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Ismail");

        e1.afficheNotes();
        System.out.println("Nombre de notes : " + e1.getNbreNotes());
        System.out.println("Note minimale : " + e1.getFaibleNote());
        System.out.println("Note Maximale : " + e1.getSupNote());
        System.out.println("La moyenne : " + e1.calcMoyenne());
    }
}
