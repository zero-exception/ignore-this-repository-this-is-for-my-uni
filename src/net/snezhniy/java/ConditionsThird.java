package net.snezhniy.java;

import java.util.Scanner;

public class ConditionsThird {
    Scanner scanner;

    public ConditionsThird(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Укажите числа стороны трегольника.\nВведите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Числа могут являться сторонами треугольника!");
        } else {
            System.out.println("Числа не могут быть сторонами треугольника.");
        }
    }
}
