package TP2.Ex3;

public class Main {
    public static void main (String[] args) {
        // Creationn des points
        Point O = new Point("0", 0, 0);
        Point A = new Point("A", 3, 3);
        Point B = new Point("B", 2, 5);
        // Creation des droites
        Droite d1 = new Droite();
        Droite d2 = new Droite(2, 1);

        System.out.println("Affichage des points : ");
        System.out.println(O);
        System.out.println(A);
        System.out.println(B);

        System.out.println("Affichage des droites : ");
        System.out.println(d1);
        System.out.println(d2);

        Point I = d1.pointIntersect(d2);
        if (I != null)
            System.out.println("Point d'intersection de: "+ d1 + " et " + d2 + " est : " + I);

        if (d1.estAppartient(B))
            System.out.println(B + " appartient à la droite " + d1);
        else
            System.out.println(B + " n'appartient pas à la droite " + d1);

        System.out.println("Déplacement : ");
        System.out.println("Avant: "+ B);
        B.deplacerX(2);
        System.out.println("Après: "+ B);

    }
}