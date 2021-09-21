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
Модифицировать программу №3. Ввести 3 числа, затем, на запрос о
действии, ввести либо +1, либо -1. Если введена 1, ищется наибольшее из
трех введенных чисел, если введена -1, то наименьшее. Если введено другое
какое-то число, программа прекращает работу (с уведомлением об этом).
*/

import java.util.Scanner;
import java.util.stream.IntStream;

public class Prog4 {
    public void run() {
        var scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        var a = scan.nextInt();

        System.out.print("Введите второе число: ");
        var b = scan.nextInt();

        System.out.print("Введите третье число: ");
        var c = scan.nextInt();

        System.out.print("Выберите действие:\n •  1 — найти наибольше из указанных чисел\n • -1 — найти наименьшее из указанных чисел\nВведите вариант: ");
        var actionType = scan.nextInt();

        if (actionType == 1)
            System.out.printf("Наибольшее число: %s\n", IntStream.of(a, b, c).max().getAsInt());
        else if (actionType == -1)
            System.out.printf("Наименьшее число: %s\n", IntStream.of(a, b, c).min().getAsInt());
        else
            System.out.println("Указано неверное действие!");
    }
}
