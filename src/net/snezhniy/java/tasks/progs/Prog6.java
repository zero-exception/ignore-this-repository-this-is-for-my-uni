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
Программу №5 зациклить, т.е. поместить в цикл while, так, чтобы
запросы на ввод трех чисел, и на действие выдавались постоянно. Условие
выхода из цикла (и программы) ввод значения 0 на запрос о действии.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prog6 {
    public String buildInfo(Iterable<Integer> numbers) {
        var info = new StringBuilder("\nДополнительная информация:\n");
        for (var n : numbers) {
            info.append(String.format(" • Число %s является ", n));

            if (n > 0) {
                info.append("положительным, ");
            } else if (n < 0) {
                info.append("отрицательным, ");
            }

            if (n % 2 == 0) {
                info.append("чётным, ");
            } else {
                info.append("нечётным, ");
            }

            if (n > 10) {
                info.append("больше десяти.");
            } else if (n < 10) {
                info.append("меньше десяти.");
            } else {
                info.append("равно десяти.");
            }

            info.append("\n");
        }
        return info.toString();
    }

    public void run() {
        var scan = new Scanner(System.in);
        var numbers = new ArrayList<Integer>();

        mainLoop:
        while (true) {
            System.out.println("Введите три числа: ");
            for (int i = 0; i < 3; i++) {
                var n = scan.nextInt();
                if (n == 0) {
                    break mainLoop;
                }
                numbers.add(n);
            }

            System.out.print("Выберите действие:\n •  1 — найти наибольше из указанных чисел\n • -1 — найти наименьшее из указанных чисел\nВведите вариант: ");
            var actionType = scan.nextInt();


            if (actionType == 1) {
                System.out.printf("\nНаибольшее число: %s\n", numbers.stream().max(Integer::compareTo).orElse(null));
            } else if (actionType == -1) {
                System.out.printf("\nНаименьшее число: %s\n", numbers.stream().min(Integer::compareTo).orElse(null));
            } else {
                System.out.println("\nУказано неверное действие!");
                return;
            }

            var info = buildInfo(numbers);
            System.out.println(info);

            numbers.clear();
        }
    }
}
