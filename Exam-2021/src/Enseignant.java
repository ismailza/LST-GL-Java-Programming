public class Enseignant extends Personne {
    private String specialite;
    static private int nbEnseignants = 0;

    public Enseignant (String nom, String prenom, String adresse, String specialite) {
        super(nom, prenom, adresse);
        this.specialite = specialite;
        nbEnseignants++;
    }

    public String getCategorie () {
        return "Enseignant";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nSpecialité: "+ this.specialite;
    }
}
