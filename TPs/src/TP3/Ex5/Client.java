package TP3.Ex5;

import java.util.ArrayList;

public class Client {
    private long numero;
    private String nom;
    private String adresse;
    ArrayList<Compte> comptes;

    public Client (long numero, String nom, String adresse) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
        this.comptes = new ArrayList<Compte>();
    }

    public long getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void ajouterCompte (Compte compte) {
        this.comptes.add(compte);
    }

    public void afficherCompte (int numCompte) {
        boolean found = false;
        for (Compte compte : this.comptes) {
            if (compte.getNumCompte() == numCompte) {
                System.out.println(compte);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Le compte n'a pas été trouvé");
    }

    public void afficherComptes () {
        for (Compte compte : this.comptes) {
            System.out.println(compte);
        }
    }
}
