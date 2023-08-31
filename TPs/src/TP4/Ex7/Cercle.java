package TP4.Ex7;

public class Cercle extends Ellipse {
    private double rayon;

    public Cercle(Point p, double rayon) {
        super(p, rayon,rayon);
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double getDiametre() {
        return rayon*2;
    }
    @Override
    public String getTypeForme() {
        return "La forme Cercle";
    }
    @Override
    public String toString() {
        return this.getTypeForme()
                + "(" + this.p
                + ", "
                + this.rayon
                + ")";
    }
}
