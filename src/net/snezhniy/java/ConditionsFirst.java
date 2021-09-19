package net.snezhniy.java;

import java.util.Scanner;

public class ConditionsFirst {
    Scanner scanner;

    public ConditionsFirst(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        System.out.printf("Наибольшее число: %s", max);
    }
}
