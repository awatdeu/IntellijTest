package Datum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class DateParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate parsedDate = null;

        while (parsedDate == null) {
            System.out.print("Bitte geben Sie ein Datum ein (Format yyyy-MM-dd): ");
            String dateAsString = scanner.nextLine();

            try {
                parsedDate = LocalDate.parse(dateAsString);
            } catch (DateTimeParseException e) {
                System.out.println("! Ungültiges Datumsformat. Bitte versuchen Sie es erneut.");
            }
        }

        System.out.println("\n--- Erfolgreich geparst ---");
        System.out.println("Das eingegebene Datum ist: " + parsedDate);

        System.out.println("\n--- Optionale Berechnung der Tage ---");
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(today, parsedDate);

        if (daysBetween > 0) {
            System.out.println("Es sind " + daysBetween + " Tage bis zum eingegebenen Datum.");
        } else if (daysBetween < 0) {
            System.out.println("Das eingegebene Datum war vor " + Math.abs(daysBetween) + " Tagen.");
        } else {
            System.out.println("Das eingegebene Datum ist heute.");
        }

        System.out.println("\n--- Optionale Formatierung ---");

        // Deutsches Format
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN);
        System.out.println("Deutsches Format: " + parsedDate.format(germanFormatter));

        // US Format
        DateTimeFormatter englishFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        System.out.println("Englisches Format (US): " + parsedDate.format(englishFormatter));

        scanner.close();
    }
}