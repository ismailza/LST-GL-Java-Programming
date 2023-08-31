package TP4.Ex7;

public class Ellipse extends Forme {
    private double grandRayon;
    private double petitRayon;

    public Ellipse(Point p,double grandRayon, double petitRayon) {
        super(p);
        this.grandRayon = grandRayon;
        this.petitRayon = petitRayon;
    }
    public double getGrandRayon() {
        return grandRayon;
    }
    public void setGrandRayon(double grandRayon) {
        this.grandRayon = grandRayon;
    }
    public double getPetitRayon() {
        return petitRayon;
    }
    public void setPetitRayon(double petitRayon) {
        this.petitRayon = petitRayon;
    }
    @Override
    public String getTypeForme() {
        return super.getTypeForme() + "Ellipse";
    }
    // p=2*PI * racine((a2+b2)/2)
    @Override
    public double perimetre() {
        return ajuster(2 * Math.PI
                * Math.sqrt((Math.pow(grandRayon, 2)
                + Math.pow(petitRayon, 2))/2));
    }
    // p= PI*(3(a+b)-racine((3a+b)(a+3b)))
    // et methode = "Ramanujan"
    public double perimetre(String methode) {
        return ajuster(Math.PI * (
                3 * (grandRayon + petitRayon)
                        - Math.sqrt((3 * grandRayon + petitRayon)
                        * (grandRayon + 3 * petitRayon))
        ));
    }
    @Override
    public double surface() {
        return ajuster(Math.PI * grandRayon * petitRayon);
    }
    @Override
    public String toString() {
        return super.toString() + ","
                + this.grandRayon
                + " x "
                + this.petitRayon
                + ")";
    }
}
