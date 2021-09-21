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
Ввести 3 числа, выдать на экран сообщение о том, могут ли эти числа
быть сторонами треугольника (сумма двух любых больше третьего).
*/

import java.util.Scanner;

public class Prog3 {
    public void run() {
        var scan = new Scanner(System.in);

        System.out.print("Укажите числа стороны трегольника.\nВведите первое число: ");
        var a = scan.nextInt();

        System.out.print("Введите второе число: ");
        var b = scan.nextInt();

        System.out.print("Введите третье число: ");
        var c = scan.nextInt();


        if (a + b > c && b + c > a && c + a > b)
            System.out.print("Числа могут являться сторонами треугольника!");
        else
            System.out.print("Числа не могут быть сторонами треугольника.");
    }
}
