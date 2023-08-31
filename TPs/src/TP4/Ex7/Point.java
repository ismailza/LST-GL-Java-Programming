package TP4.Ex7;

public class Point {
    private double abscisse;
    private double ordonnee;

    public Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public double getAbscisse() {
        return abscisse;
    }
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
    public double getOrdonnee() {
        return ordonnee;
    }
    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    public void setPoint(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public void deplacerX(double dx) {
        this.abscisse += dx;
    }
    public void deplacerY(double dy) {
        this.ordonnee += dy;
    }
    public void deplacerXY(double dx, double dy) {
        this.abscisse += dx;
        this.ordonnee += dy;
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.abscisse - p.abscisse, 2) + Math.pow(this.ordonnee - p.ordonnee, 2) );
    }
    @Override
    public String toString() {
        return "(" + this.abscisse + ", " + this.ordonnee +")";
    }
}
