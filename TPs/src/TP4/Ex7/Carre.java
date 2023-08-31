package TP4.Ex7;

public class Carre extends Rectangle {
    private double cote;

    public Carre(Point p, double cote) {
        super( p, cote, cote);
        this.cote = cote;
    }
    public double getCote() {
        return cote;
    }
    public void setCote(double cote) {
        this.cote = cote;
    }
    @Override
    public String getTypeForme() {
        return "La forme Carré" ;
    }

    @Override
    public String toString() {
        return this.getTypeForme()
                + "(" + this.p
                + ", " + this.cote
                + ")";
    }
}
