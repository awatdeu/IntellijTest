package ArbitrageCalc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArbitrageCalculator {

    public static void calculate(double odd1, double odd2) {
        // Step 1: Calculate implied probabilities for each odd
        // احتمال ضمنی برای هر ضریب محاسبه می‌شود
        double impliedProb1 = 1 / odd1;
        double impliedProb2 = 1 / odd2;

        // Step 2: Calculate the sum of implied probabilities
        // مجموع احتمالات ضمنی محاسبه می‌شود
        double totalImpliedProb = impliedProb1 + impliedProb2;

        // Step 3: Check for arbitrage opportunity
        // بررسی می‌شود که آیا مجموع احتمالات کمتر از ۱ است یا نه
        if (totalImpliedProb < 1) {
            System.out.println("فرصت آربیتراژ پیدا شد!");

            // Step 4: Calculate guaranteed profit percentage
            // درصد سود تضمینی محاسبه می‌شود
            double profitPercentage = ((1 / totalImpliedProb) - 1) * 100;

            // Step 5: Calculate the stake percentages for each odd
            // درصد تقسیم مبلغ برای هر ضریب محاسبه می‌شود
            double stakePercentage1 = (impliedProb1 / totalImpliedProb) * 100;
            double stakePercentage2 = (impliedProb2 / totalImpliedProb) * 100;

            // Formatting the output to two decimal places
            // خروجی برای نمایش دو رقم اعشار فرمت‌بندی می‌شود
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("-----------------------------------------");
            System.out.println("درصد سود تضمینی: " + df.format(profitPercentage) + "%");
            System.out.println("نحوه تقسیم سرمایه:");
            System.out.println("  - روی ضریب " + odd1 + ": " + df.format(stakePercentage1) + "% از کل مبلغ");
            System.out.println("  - روی ضریب " + odd2 + ": " + df.format(stakePercentage2) + "% از کل مبلغ");
            System.out.println("-----------------------------------------");

        } else {
            // If the sum is not less than 1, there is no profit opportunity
            // اگر مجموع کمتر از ۱ نباشد، فرصت سودی وجود ندارد
            double bookmakerMargin = (totalImpliedProb - 1) * 100;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("فرصت آربیتراژ وجود ندارد.");
            System.out.println("مارجین (حاشیه سود) سایت شرط‌بندی: " + df.format(bookmakerMargin) + "%");
        }
    }

    public static void main(String[] args) {
        // Using the values from the image
        // استفاده از مقادیر موجود در تصویر
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Odd1: ");
        double firstOdd = scanner.nextDouble();

        System.out.println("Please enter Odd2: ");
        double secondOdd = scanner.nextDouble();

        System.out.println("محاسبه برای ضریب‌های " + firstOdd + " و " + secondOdd + ":");
        calculate(firstOdd, secondOdd);

        System.out.println("\nمثال دیگر (بدون فرصت آربیتراژ):");
        calculate(2.1, 2.2); // An example where there is no arbitrage
    }
}
