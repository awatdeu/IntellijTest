package Calc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result;

        System.out.print("Geben Sie die erste Zahl ein: ");
        num1 = input.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        num2 = input.nextDouble();

        System.out.print("Wählen Sie einen der Operatoren aus (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Fehler!!! Eine Division durch Null ist nicht möglich");
                }
                break;

            default:
                System.out.println("Fehler !!! Der eingegebene Operator ist ungültig. ");
                break;
        }

        input.close();
    }
}