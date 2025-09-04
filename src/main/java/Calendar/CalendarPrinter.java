package Calendar;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class CalendarPrinter {

    public static void printCalendar(int month, int year) {
        YearMonth yearMonth = YearMonth.of(year, month);

        DateTimeFormatter headerFormatter = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.GERMAN);
        String header = yearMonth.format(headerFormatter);

        String border = "-------------------------";

        System.out.println(border);
        System.out.println(header);
        System.out.println(border);

        int daysInMonth = yearMonth.lengthOfMonth();

        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate currentDate = yearMonth.atDay(day);

            String dayOfWeek = currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN);


            System.out.printf(" %02d | %-15s |\n", day, dayOfWeek);
        }

        System.out.println(border);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Kalender-Drucker ---");

        System.out.print("Bitte geben Sie ein Jahr ein: ");
        int inputYear = scanner.nextInt();

        System.out.print("Bitte geben Sie einen Monat ein (1-12): ");
        int inputMonth = scanner.nextInt();

        scanner.close();

        System.out.println();

        printCalendar(inputMonth, inputYear);
    }
}
