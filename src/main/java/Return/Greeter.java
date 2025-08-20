package Return;

import java.util.Scanner;

public class Greeter {

    // این متد یک مقدار از نوع String برمی‌گرداند
    public String getGreetingMessage(String name) {
        if (name == null || name.isEmpty()) {
            return "سلام، مهمان!"; // اگر نامی وارد نشده باشد، این پیام را برمی‌گرداند
        }
        return "سلام، " + name + "!"; // پیام خوشامدگویی را با نام ورودی برمی‌گرداند
    }

    public static void main(String[] args) {


        Greeter greeter = new Greeter();

        String message1 = greeter.getGreetingMessage("علی");
        String message2 = greeter.getGreetingMessage("");

        System.out.println(message1); // خروجی: سلام، علی!
        System.out.println(message2); // خروجی: سلام، مهمان!
    }
}