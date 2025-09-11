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
        // 1. یک اسکنر برای خواندن ورودی از کاربر ایجاد می‌کنیم
        Scanner scanner = new Scanner(System.in);
        LocalDate parsedDate = null;

        // 2. یک حلقه ایجاد می‌کنیم که تا زمان وارد کردن تاریخ معتبر ادامه پیدا می‌کند
        while (parsedDate == null) {
            // از کاربر می‌خواهیم تاریخ را وارد کند
            System.out.print("Bitte geben Sie ein Datum ein (Format yyyy-MM-dd): ");
            String dateAsString = scanner.nextLine();

            try {
                // 3. تلاش می‌کنیم رشته ورودی را به تاریخ تبدیل کنیم
                parsedDate = LocalDate.parse(dateAsString);
            } catch (DateTimeParseException e) {
                // 4. اگر فرمت ورودی اشتباه بود، این بلاک اجرا می‌شود
                System.out.println("! Ungültiges Datumsformat. Bitte versuchen Sie es erneut.");
            }
        }

        // --- اگر تبدیل موفقیت‌آمیز بود، ادامه برنامه اجرا می‌شود ---
        System.out.println("\n--- Erfolgreich geparst ---");
        System.out.println("Das eingegebene Datum ist: " + parsedDate);

        // --- بخش اختیاری اول: محاسبه اختلاف روزها ---
        System.out.println("\n--- Optionale Berechnung der Tage ---");
        LocalDate today = LocalDate.now(); // تاریخ امروز را می‌گیریم
        long daysBetween = ChronoUnit.DAYS.between(today, parsedDate);

        if (daysBetween > 0) {
            System.out.println("Es sind " + daysBetween + " Tage bis zum eingegebenen Datum.");
        } else if (daysBetween < 0) {
            System.out.println("Das eingegebene Datum war vor " + Math.abs(daysBetween) + " Tagen.");
        } else {
            System.out.println("Das eingegebene Datum ist heute.");
        }

        // --- بخش اختیاری دوم: فرمت‌بندی تاریخ به زبان‌های مختلف ---
        System.out.println("\n--- Optionale Formatierung ---");

        // فرمت آلمانی
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN);
        System.out.println("Deutsches Format: " + parsedDate.format(germanFormatter));

        // فرمت انگلیسی (آمریکا)
        DateTimeFormatter englishFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        System.out.println("Englisches Format (US): " + parsedDate.format(englishFormatter));

        // در پایان اسکنر را می‌بندیم
        scanner.close();
    }
}