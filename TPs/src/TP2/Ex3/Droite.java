package TP2.Ex3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Droite {
    private double pente;
    private double ordonneeOrigine;

    public Droite () {
        this.pente = 1;
        this.ordonneeOrigine = 0;
    }

    public Droite (double a, double b) {
        this.pente = a;
        this.ordonneeOrigine = b;
    }

    public void setPente (double pente) {
        this.pente = pente;
    }

    public double getPente () {
        return this.pente;
    }

    public void setOrdonneeOrigine (double ordonneeOrigine) {
        this.ordonneeOrigine = ordonneeOrigine;
    }

    public double getOrdonneeOrigine () {
        return this.ordonneeOrigine;
    }

    public boolean estAppartient (Point p) {
        return ((p.getOrdonnee() - this.ordonneeOrigine) / p.getAbscisse()) == this.pente;
    }

    public Point pointIntersect(Droite d) {
        if (this.pente == d.pente) {
            System.out.println("Les droites sont parallèles");
            return null;
        }

        double xIntersect = (d.ordonneeOrigine - this.ordonneeOrigine) / (this.pente - d.pente);
        double yIntersect = this.pente * xIntersect + this.ordonneeOrigine;

        return new Point("I", xIntersect, yIntersect);
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = new DecimalFormat("##.###");
        return "y = " +
                (this.pente == 1 ? "" : numberFormat.format(this.pente)) + "x" +
                (this.ordonneeOrigine == 0 ? "": " + " + numberFormat.format(this.ordonneeOrigine));
    }
}