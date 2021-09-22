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
№6. Заполнить массив из 10 элементов случайными целыми числами.
Осуществить сортировку массива методом пузырька. Т.е. расположить числа
в массиве по возрастанию. Вывести преобразованный массив на консоль.
*/

public class Prog15 implements Prog {
    public void run() {
        var arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(-10, 11);
        }

        var sortedArr = Arrays
                .stream(arr)
                .sorted()
                .toArray();

        System.out.printf("Массив: %s\n", Arrays.toString(arr));
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(sortedArr));
    }
}
