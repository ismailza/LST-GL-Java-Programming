abstract public class Personne {
    protected String nom;
    protected String prenom;
    protected String adresse;
    static private int nbPersonnes = 0;

    public Personne (String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        nbPersonnes++;
    }

    static public void afficherEffectif () {
        System.out.println("Effectif total : "+ nbPersonnes);
    }

    abstract public String getCategorie ();

    @Override
    public String toString () {
        return "Nom: "+ this.nom +
                "\nPrénom: "+ this.prenom+
                "\nAdresse: "+ this.adresse;
    }
}
