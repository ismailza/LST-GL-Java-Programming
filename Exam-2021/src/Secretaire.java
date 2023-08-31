public class Secretaire extends Personne {
    private int numBureau;
    static private int nbSecretaires = 0;

    public Secretaire (String nom, String prenom, String adresse, int numBureau) {
        super(nom, prenom, adresse);
        this.numBureau = numBureau;
        nbSecretaires++;
    }

    public String getCategorie () {
        return "Secretaire";
    }

    @Override
    public String toString() {
        return super.toString()+
                "Num bureau: "+ this.numBureau;
    }
}
