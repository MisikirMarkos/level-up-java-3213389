package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {

        if (gallonsUsage <= 1496.0) {
            return 18.84;
        } else {
            double actualUsage = gallonsUsage - 1496.0;
            double usedInCCF = Math.ceil(actualUsage / 748);
            return (usedInCCF * 3.90) + 18.84;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
