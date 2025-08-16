package com.shop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainApp {

    private static String oprName;  //????

    public static void main(String[] args) {
        while (true){
            try {


                System.out.println("Please enter operators count or enter '0' to exit program: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int operatorsCount = Integer.parseInt(reader.readLine());
                if (operatorsCount == 0) {
                    System.out.println("Bis gleich ");
                    break;

                }
                double bestOperatorSumPrice = 0;
                String bestOperatorName = "";
                double shopSumPrice=0;


                double sumPrice = 0;
                for (int oprIndex = 0; oprIndex < operatorsCount; oprIndex++) {

                    System.out.println("Please enter operator " + (oprIndex + 1) + "name: ");
                    String oprName = reader.readLine();
                    System.out.println("please enter " + oprName + "'s invoice count: ");
                    int invoiceCount = Integer.parseInt(reader.readLine());
                    sumPrice = 0;

                    for (int invIndex = 0; invIndex < invoiceCount; invIndex++) {
                        System.out.println("please enter" + oprName + "'s invoice " + (invIndex + 1) + " Price: ");
                        double invPrice = Double.parseDouble((reader.readLine()));
                        sumPrice += invPrice;
                        shopSumPrice = invPrice;
                    }
                    double averagePrice = sumPrice / invoiceCount;

                    System.out.printf("Summary price for " + oprName + " is: %f\n",sumPrice);

                    System.out.printf("Average price for " + oprName + " is: %f\n",averagePrice);
                    if (sumPrice <= 5_000_000) {
                        System.out.println(oprName + "is low level operator!");
                    } else if (sumPrice > 5_000_000 && sumPrice <= 10_000_000) {
                        System.out.println(oprName + "is medium level operator!");
                    }

                    if (sumPrice > 10_000_000) {
                        System.out.println(oprName + "is high level operator!");
                    }

                if (sumPrice > bestOperatorSumPrice) {
                    bestOperatorSumPrice = sumPrice;
                    bestOperatorName = oprName;


                }
                    System.out.println("Reamins operator count: " + (operatorsCount- oprIndex-1));
            }
                //+++++++++++++++
                System.out.printf("Shop sum price : %f\n ", shopSumPrice);
                System.out.printf("Best operator is " + bestOperatorName+  " with %f\n summary.  " , bestOperatorSumPrice);


            }
            catch (ArithmeticException e) {
                System.out.println("Please enter a Valid input ");;
            }catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
    }
}
