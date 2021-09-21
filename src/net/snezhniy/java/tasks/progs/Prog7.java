/*
 * MIT License
 *
 * Copyright (c) 2021 snezhniy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.snezhniy.java.tasks.progs;

/*
Ввести начальное значение аргумента (xn), конечное значение аргумента
(xk), шаг (dx) - все значения тип double. Протабулировать функцию
y=exp(-x)*sin(x), т.е. для каждого значения аргумента из диапазона,
рассчитать функцию. Значения аргумента и функции вывести на консоль.
Программу написать с использованием цикла while.
*/

import java.util.Scanner;

public class Prog7 {
    private boolean isValidStep(double xn, double xk, double dx) {
        var totalSteps = (xk - xn) / dx;
        return (totalSteps % 1.0) == 0.0;
    }

    private double calculateValue(double x) {
        return Math.exp(-x) * Math.sin(x);
    }

    public void run() {
        var scanner = new Scanner(System.in);

        System.out.print("Укажите начальное значение аргумента (xn): ");
        var xn = Double.parseDouble(scanner.nextLine());

        System.out.print("Укажите конечное значение аргумента (xk): ");
        var xk = Double.parseDouble(scanner.nextLine());

        System.out.print("Укажите рамер шага (dx): ");
        var dx = Double.parseDouble(scanner.nextLine());

        if (!isValidStep(xn, xk, dx)) {
            System.out.println("Вы указали некорректный размер шага.");
            return;
        }

        for (var x = xn; x <= xk; x += dx) {
            var y = calculateValue(x);
            System.out.printf("x = %s, y(x) = %s\n", x, y);
        }
    }
}
