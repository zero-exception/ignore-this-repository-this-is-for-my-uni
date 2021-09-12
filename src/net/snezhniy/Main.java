package net.snezhniy;

import net.snezhniy.tasks.conditions.ConditionsFirst;
import net.snezhniy.tasks.conditions.ConditionsSecond;
import net.snezhniy.tasks.conditions.ConditionsThird;
import net.snezhniy.tasks.conditions.ConditionsThirdButKotlin;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ConditionsFirst task1 = new ConditionsFirst(scanner);
        ConditionsSecond task2 = new ConditionsSecond(scanner);
        ConditionsThird task3 = new ConditionsThird(scanner);

        ConditionsThirdButKotlin task3Kt = new ConditionsThirdButKotlin();

        task3Kt.run();
    }
}
