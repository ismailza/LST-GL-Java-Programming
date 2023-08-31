package TP3.Ex5;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(123456, "Ismail", "Maroc");

        Compte compte1 = new Compte(client1);
        client1.ajouterCompte(compte1);
        Compte compte2 = new Compte(client1, 3000);
        client1.ajouterCompte(compte2);

        client1.afficherComptes();

        compte1.crediter(1000);
        compte2.debiter(500);
        compte2.virement(compte1, 600);

        System.out.println("*****");
        System.out.println(compte1);
        System.out.println("*****");
        System.out.println(compte2);

    }
}
