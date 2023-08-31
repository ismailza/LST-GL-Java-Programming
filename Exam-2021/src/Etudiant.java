public class Etudiant extends Personne {
    private String diplome;
    static private int nbEtudiants = 0;

    public Etudiant (String nom, String prenom, String adresse, String diplome) {
        super(nom, prenom, adresse);
        this.diplome = diplome;
        nbEtudiants++;
    }

    public String getDiplome () {
        return this.diplome;
    }

    public String getCategorie () {
        return "Etudiant";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDiplome: "+ this.diplome;
    }
}
