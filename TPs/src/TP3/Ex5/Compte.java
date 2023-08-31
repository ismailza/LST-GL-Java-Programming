package TP3.Ex5;

public class Compte {
    static int compteur = 1000;
    private int numCompte;
    private double solde;
    private Client proprietaire;
    private double decouvertMax = 2000.0;
    private double debitMax = 4000.0;

    public Compte (Client proprietaire) {
        this.numCompte = compteur++;
        this.proprietaire = proprietaire;
        this.solde = 0;
    }

    public Compte (Client proprietaire, double solde) {
        this.numCompte = compteur++;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public int getNumCompte () {
        return this.numCompte;
    }

    public double getSolde () {
        return this.solde;
    }

    public double getDecouvertMax () {
        return this.decouvertMax;
    }

    public double getDebitMax () {
        return this.debitMax;
    }

    public void setDecouvertMax (double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public void setDebitMax (double debitMax) {
        this.debitMax = debitMax;
    }

    public void crediter (double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void debiter (double montant) {
        if ((montant > 0) && (montant <= (solde + decouvertMax))) {
            solde -= montant;
        }
    }

    public void virement (Compte compteDest, double montant) {
        if ((montant > 0) && (montant <= solde + decouvertMax)) {
            solde -= montant;
            compteDest.crediter(montant);
        }
    }

    @Override
    public String toString () {
        return "Numéro de compte: " + this.numCompte +
                "\nNom du propriétaire: " + this.proprietaire.getNom() +
                "\nSolde: " + this.solde + " DH" +
                "\nDécouvert maximal autorisé: " + this.decouvertMax + " DH" +
                "\nDébit maximal autorisé: " + this.debitMax + " DH" +
                "\nSituation du compte: " + (solde < 0 ? "À découvert" : "En positif");
    }
}
