package TP2.Ex3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Point {
    private String nom;
    private double abscisse;
    private double ordonnee;

    public Point (String nom, double abscisse, double ordonnee) {
        this.nom = nom;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return this.nom;
    }

    public void setAbscisse (double abscisse) {
        this.abscisse = abscisse;
    }

    public double getAbscisse () {
        return this.abscisse;
    }

    public void setOrdonnee (double ordonnee) {
        this.ordonnee = ordonnee;
    }

    public double getOrdonnee () {
        return this.ordonnee;
    }

    public void deplacerX (int longueur) {
        this.abscisse += longueur;
    }

    public void deplacerY (int longueur) {
        this.ordonnee += longueur;
    }

    public double distance (Point p) {
        return Math.sqrt(Math.pow((this.abscisse - p.abscisse), 2) + Math.pow((this.ordonnee - p.ordonnee), 2));
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = new DecimalFormat("##.###");
        return this.nom +"(" + numberFormat.format(this.abscisse) +", " + numberFormat.format(this.ordonnee) +")";
    }
}