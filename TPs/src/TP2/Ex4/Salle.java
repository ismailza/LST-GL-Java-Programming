package TP2.Ex4;

public class Salle {
    private String titre;
    private int nbPlaces;
    private double prixBillet;
    private int nbPlaceTN;
    private int nbPlaceTR;

    public Salle (String titre, int nbPlaces, double prixBillet) {
        this.titre = titre;
        this.nbPlaces = nbPlaces;
        this.prixBillet = prixBillet;
        this.nbPlaceTN = 0;
        this.nbPlaceTR = 0;
    }

    public void setTitre (String titre) {
        this.titre = titre;
    }

    public String getTitre () {
        return this.titre;
    }

    public void setNbPlaces (int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getNbPlaces () {
        return this.nbPlaces;
    }

    public void setPrixBillet (double prixBillet) {
        this.prixBillet = prixBillet;
    }

    public double getPrixBillet () {
        return this.prixBillet;
    }

    public int getNbPlaceTN () {
        return this.nbPlaceTN;
    }

    public int getNbPlaceTR () {
        return this.nbPlaceTR;
    }

    public int nbPlacesDisponibles () {
        return nbPlaces - (nbPlaceTN + nbPlaceTR);
    }

    public void vendrePlaces (int nbPlaces, boolean tarifReduit) {
        double prixTotal;
        if (nbPlaces > this.nbPlacesDisponibles())
            System.out.println("Vente impossible! Nombre de place disponible est insuffisant");
        else {
            prixTotal = this.prixBillet * nbPlaces;
            if (tarifReduit) {
                this.nbPlaceTR += nbPlaces;
                prixTotal *= 0.8;
            }
            else
                this.nbPlaceTN += nbPlaces;
            System.out.println("Le prix total est : "+ prixTotal);
        }
    }

    public void remizeAZero () {
        this.nbPlaceTN = this.nbPlaceTR = 0;
    }

    public double chiffreAffaires () {
        return (this.nbPlaceTN + this.nbPlaceTR * 0.8) * this.prixBillet;
    }

    public double tauxRemplissage () {
        return (double) ((this.nbPlaceTN + this.nbPlaceTR) * 100) / this.nbPlaces;
    }

    @Override
    public String toString() {
        return "Film joué : "+ this.titre +
                "\nPrix du billet : "+ this.prixBillet +
                "\nNombre de places : "+ this.nbPlaces +
                "\nNombre de places à tarif normal : "+ this.nbPlaceTN +
                "\nNombre de places à tarif réduit : "+ this.nbPlaceTR +
                "\nPlaces disponibles : "+ this.nbPlacesDisponibles() +
                "\nTaux de remplissage : "+ this.tauxRemplissage() +" %" +
                "\nChiffre d'affaire : "+ this.chiffreAffaires() +" DH";
    }
}