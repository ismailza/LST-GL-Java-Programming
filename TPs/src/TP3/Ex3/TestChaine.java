package TP3.Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestChaine {
    private String chaine;

    {
        System.out.println("Donner une chaine : ");
        Scanner sc = new Scanner(System.in);
        this.chaine = sc.nextLine();
    }

    public void afficheNPC (int n) {
        if (n <= 0)
            System.out.println("La valeur de n doit être positive.");
        else if (n > chaine.length())
            System.out.println("La valeur de n dépasse la longueur de la chaîne.");
        else
            System.out.println("Les " + n + " premiers caractères sont : " + this.chaine.substring(0, n));
    }

    public void afficheNDC (int n) {
        if (n <= 0)
            System.out.println("La valeur de n doit être positive.");
        else if (n > chaine.length())
            System.out.println("La valeur de n dépasse la longueur de la chaîne.");
        else
            System.out.println("Les " + n + " derniers caractères sont : " + this.chaine.substring(this.chaine.length() - n));
    }

    public void majCh () {
        System.out.println("Chaine en majuscule : "+ this.chaine.toUpperCase());
    }

    public void minCh () {
        System.out.println("Chaine en miniscule : "+ this.chaine.toLowerCase());
    }

    public void isJavaSource () {
        System.out.println("Fichier java : " + this.chaine.endsWith(".java"));
    }

    public void getNbreVoyelles () {
        ArrayList<Character> voyelles = new ArrayList<>();
        voyelles.add('a');
        voyelles.add('e');
        voyelles.add('i');
        voyelles.add('o');
        voyelles.add('u');
        voyelles.add('y');

        int[] counts = new int[6]; // 6 voyelles

        for (char c : chaine.toLowerCase().toCharArray())
            if (voyelles.contains(c))
                counts[voyelles.indexOf(c)]++;
        System.out.println("Nombre de voyelles : ");
        for (int i = 0; i < voyelles.size(); i++)
            System.out.println("----- " + counts[i] + " fois pour " + voyelles.get(i));
    }


}
