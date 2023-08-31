package TP3.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {
    private String nom;
    private ArrayList<Note> notes = new ArrayList<Note>();

    public Etudiant (String nom) {
        this.nom = nom;
    }

    {
        float note;
        int coefficient;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir les notes de l'étudiant : ");
        do {
            System.out.println("Note : ");
            note = sc.nextFloat();
            if ((0 <= note) && (note <= 20)) {
                System.out.println("Coefficient : ");
                coefficient = sc.nextInt();
                this.ajouterNote(new Note(note, coefficient));
            } else if (note != -1)
                System.out.println("Note invalide. Veuillez saisir une note entre 0 et 20.");
        } while (note != -1);
        sc.close();
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return this.nom;
    }

    public void ajouterNote (Note n) {
        this.notes.add(n);
    }

    public void supprimerNote (Note n) {
        this.notes.remove(n);
    }

    public void supprimerNote (int indice) {
        this.notes.remove(indice);
    }

    public int getNbreNotes () {
        return this.notes.size();
    }

    public float getFaibleNote () {
        if (this.notes.isEmpty()) return 0;
        float noteMin = this.notes.get(0).getNote();
        for (Note note : this.notes) {
            if (note.getNote() < noteMin) noteMin = note.getNote();
        }
        return noteMin;
    }

    public float getSupNote () {
        if (this.notes.isEmpty()) return 0;
        float noteMax = this.notes.get(0).getNote();
        for (Note note : this.notes) {
            if (note.getNote() > noteMax) noteMax = note.getNote();
        }
        return noteMax;
    }

    public float calcMoyenne () {
        if (this.notes.isEmpty()) return 0;
        float average = 0;
        int totCoeff = 0;
        for (Note note : this.notes) {
            average += note.getNote() * note.getCoefficient();
            totCoeff += note.getCoefficient();
        }
        return (float) (average / totCoeff);
    }

    public void afficheNotes () {
        for (Note note : this.notes) {
            System.out.println(note);
        }
    }

}
