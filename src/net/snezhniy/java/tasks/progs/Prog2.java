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
№2. Ввести 3 числа, выдать на экран наименьшее (с поясняющим текстом).
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Prog2 {
    public void run() {
        var scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        var a = scan.nextInt();

        System.out.print("Введите второе число: ");
        var b = scan.nextInt();

        System.out.print("Введите третье число: ");
        var c = scan.nextInt();

        var maxNum = IntStream.of(a, b, c).max().getAsInt();
        System.out.printf("Наибольшее число: %s\n", maxNum);
    }

    public void run_v2() {
        var scan = new Scanner(System.in);
        var numbers = new ArrayList<Integer>();

        System.out.print("Введите первое число: ");
        numbers.add(scan.nextInt());

        System.out.print("Введите второе число: ");
        numbers.add(scan.nextInt());

        System.out.print("Введите третье число: ");
        numbers.add(scan.nextInt());

        var maxNum = Collections.max(numbers);
        System.out.printf("Наибольшее число: %s\n", maxNum);
    }

    public void run_v3() {
        var scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        var a = scan.nextInt();

        System.out.print("Введите второе число: ");
        var b = scan.nextInt();

        System.out.print("Введите третье число: ");
        var c = scan.nextInt();

        var maxNum = Collections.max(List.of(a, b, c));
        System.out.printf("Наибольшее число: %s\n", maxNum);
    }

    public void run_v4(){
        var scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        var a = scan.nextInt();

        System.out.print("Введите второе число: ");
        var b = scan.nextInt();

        System.out.print("Введите третье число: ");
        var c = scan.nextInt();

        var maxNum = Math.max(a, Math.max(c, b));
        System.out.printf("Наибольшее число: %s\n", maxNum);
    }
}
