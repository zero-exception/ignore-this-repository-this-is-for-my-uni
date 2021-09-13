package net.snezhniy.tasks.conditions.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConditionsSecond {
    Scanner scanner;

    public ConditionsSecond(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        /* Создадим список для хранения ввода */
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Введите первое число:");
        arr.add(scanner.nextInt());

        System.out.println("Введите второе число:");
        arr.add(scanner.nextInt());

        System.out.println("Введите третье число:");
        arr.add(scanner.nextInt());

        /* Применим встроенный метод для поиска наименьшего */
        int min = Collections.min(arr);
        System.out.printf("Наименьшее из трёх: %s", min);
    }
}
