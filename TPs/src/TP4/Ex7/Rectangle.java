package TP4.Ex7;

public class Rectangle extends Forme {
    protected double longueur;
    protected double largeur;

    public Rectangle(Point p, double longueur, double largeur) {
        super(p);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    @Override
    public double perimetre() {
        return ajuster((this.largeur + this.longueur) * 2);
    }
    @Override
    public double surface() {
        return ajuster(this.largeur * this.longueur);
    }
    @Override
    public String getTypeForme() {
        return super.getTypeForme() + "Rectangle";
    }
    @Override
    public String toString() {
        return super.toString() + ","
                + longueur
                + " x "
                + largeur
                + ")";
    }
}
