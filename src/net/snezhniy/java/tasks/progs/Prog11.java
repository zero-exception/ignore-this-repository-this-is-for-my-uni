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

import net.snezhniy.java.Prog;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
№2. Заполнить массив из 10 элементов случайными целыми числами. Найти
максимальное число в массиве и вывести результат на консоль.
*/

public class Prog11 implements Prog {
    public void run() {
        var arr = new int[10];
        for (var i = 0; i < 10; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(-10, 11);
        }

        var maxElem = Arrays
                .stream(arr)
                .max()
                .getAsInt();

        System.out.printf("Массив: %s\n", Arrays.toString(arr));
        System.out.printf("Наибольшее значение: %s\n", maxElem);
    }
}
