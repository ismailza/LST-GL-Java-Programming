package TP4.Ex7;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        Forme f = new Forme(p);
        Rectangle r = new Rectangle(new Point(2,5), 10, 6);
        Carre c = new Carre(new Point(1,4), 10);
        Ellipse el = new Ellipse(p, 7,2);
        Cercle cr = new Cercle(new Point(), 7);
        // Afficher les formes
        System.out.println("Afficher les formes :");
        System.out.println(f);
        System.out.println(r);
        System.out.println(c);
        System.out.println(el);
        System.out.println(cr);
        // Déplacer les formes
        System.out.println();
        System.out.println("Déplacer les formes :");
        f.deplacerForme(1, 2);
        System.out.println(f);
        r.deplacerForme(1, 2);
        System.out.println(r);
        c.deplacerForme(1, 2);
        System.out.println(c);
        el.deplacerForme(1, 2);
        System.out.println(el);
        cr.deplacerForme(1, 2);
        System.out.println(cr);
        // Périmètre
        System.out.println();
        System.out.println("Périmètre :");
        System.out.println("Périmètre de " + r + " est: " + r.perimetre());
        System.out.println("Périmètre de " + c + " est: " + c.perimetre());
        System.out.println("Périmètre de " + el + " est: " + el.perimetre());
        System.out.println("Périmètre 2 de " + el + " est: " + el.perimetre("Ramanujan"));
        System.out.println("Périmètre de " + cr + " est: " + cr.perimetre());
        System.out.println("Périmètre 2 de " + cr + " est: " + cr.perimetre("Ramanujan"));
        // Surface
        System.out.println();
        System.out.println("Surface :");
        System.out.println("Surface de " + r + " est: " + r.surface());
        System.out.println("Surface de " + c + " est: " + c.surface());
        System.out.println("Surface de " + el + " est: " + el.surface());
        System.out.println("Surface de " + cr + " est: " + cr.surface());
    }
}
