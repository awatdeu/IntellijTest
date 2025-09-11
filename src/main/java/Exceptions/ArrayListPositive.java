package Exceptions;

import java.util.ArrayList;
import java.util.Collection;


public class ArrayListPositive {

    public static class NullArgumentAusnahme extends IllegalArgumentException {
        public NullArgumentAusnahme(String nachricht) {
            super(nachricht);
        }
    }


    public static class NichtPositiveZahlAusnahme extends IllegalArgumentException {
        public NichtPositiveZahlAusnahme(String nachricht) {
            super(nachricht);
        }
    }


    public static class PositiveGanzzahlListe extends ArrayList<Integer> {

        private void wertPruefen(Integer wert) {
            if (wert == null) {
                throw new NullArgumentAusnahme("Null-Werte sind nicht erlaubt.");
            }
            if (wert <= 0) {
                throw new NichtPositiveZahlAusnahme("Nur positive Zahlen sind erlaubt. Wert war: " + wert);
            }
        }

        @Override
        public boolean add(Integer wert) {
            wertPruefen(wert);
            return super.add(wert);
        }

        @Override
        public void add(int index, Integer wert) {
            wertPruefen(wert);
            super.add(index, wert);
        }

        @Override
        public boolean addAll(Collection<? extends Integer> sammlung) {
            for (Integer wert : sammlung) {
                wertPruefen(wert);
            }
            return super.addAll(sammlung);
        }
    }

    public static void main(String[] args) {
        PositiveGanzzahlListe liste = new PositiveGanzzahlListe();

        System.out.println("--- Teste gültige Fälle ---");
        try {
            liste.add(10);
            liste.add(5);
            liste.add(0, 20);
            System.out.println("Positive Zahlen erfolgreich hinzugefügt.");
            System.out.println("Aktuelle Liste: " + liste);
        } catch (Exception e) {
            System.out.println("Ein unerwarteter Fehler ist aufgetreten: " + e.getMessage());
        }

        System.out.println("\n--- Teste ungültige Fälle ---");


        try {
            System.out.println("Versuche, 'null' hinzuzufügen...");
            liste.add(null);
        } catch (NullArgumentAusnahme e) {
            System.out.println("Erwartete Ausnahme gefangen: " + e.getMessage());
        }


        try {
            System.out.println("Versuche, '0' hinzuzufügen...");
            liste.add(0);
        } catch (NichtPositiveZahlAusnahme e) {
            System.out.println("Erwartete Ausnahme gefangen: " + e.getMessage());
        }


        try {
            System.out.println("Versuche, '-5' hinzuzufügen...");
            liste.add(-5);
        } catch (NichtPositiveZahlAusnahme e) {
            System.out.println("Erwartete Ausnahme gefangen: " + e.getMessage());
        }

        System.out.println("\n Endgültiger Listeninhalt: " + liste);
    }

}
