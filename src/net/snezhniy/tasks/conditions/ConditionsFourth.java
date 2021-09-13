package net.snezhniy.tasks.conditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConditionsFourth {
    Scanner scanner;

    public ConditionsFourth(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        var arr = new ArrayList<Integer>();

        System.out.println("Введите три числа:");
        for (int i = 0; i < 3; i++) {
            var input = scanner.nextInt();
            arr.add(input);
        }

        System.out.print("1 -- найти наибольшее среди трёх\n-1 -- найти наименьшее среди трёх\nКакое действие вы хотите выполнить?: ");
        var input = scanner.nextInt();
        if (input == 1) {
            var max = Collections.max(arr);
            System.out.printf("Максимальное значение из трёх чисел: %s", max);
        } else if (input == -1) {
            var min = Collections.min(arr);
            System.out.printf("Минимальное значение из трёх чисел: %s", min);
        } else {
            System.out.println("Вы указали неизвестный вариант действия! Выполнение прекращено.");
        }
    }
}
