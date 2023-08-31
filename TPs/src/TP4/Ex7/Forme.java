package TP4.Ex7;

public class Forme {
    protected Point p;
    public Forme(Point p) {
        this.p = p;
    }

    public Point getP() {
        return p;
    }
    public void setP(Point p) {
        this.p = p;
    }

    public void deplacerForme(double dx, double dy) {
        this.p.deplacerXY(dx, dy);
    }
    public String getTypeForme() {
        return "La forme ";
    }
    public double perimetre() {
        return 0.0;
    }
    public double surface() {
        return 0.0;
    }
    public String toString() {
        return this.getTypeForme() + "(" + this.p;
    }

    public double ajuster(double nbre) {
        return Math.round(nbre*100)/100.0;
    }
}