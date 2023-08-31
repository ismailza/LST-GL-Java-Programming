package TP2.Ex4;

public class Main {
    public static void main(String[] args) {
        Salle s = new Salle("Titanic", 60, 75.5);
        s.vendrePlaces(14, false);
        s.vendrePlaces(20, true);
        System.out.println(s);
        System.out.println("\n*** Remize à zero");
        s.remizeAZero();
        System.out.println(s);
    }
}