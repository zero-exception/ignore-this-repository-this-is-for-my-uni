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
import net.snezhniy.java.Triple;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/*
№7. Заполнить двумерный массив (матрицу) размером 5 строк, 4 столбца
(5х4) случайными целыми числами. Найти минимальное число в матрице и
его индексы, т.е. номер строки и столбца. Вывести исходную матрицу и
найденные индексы на консоль.
*/

public class Prog16 implements Prog {
    private Triple<Integer, Integer, Integer> getMinimum(int[][] arr) {
        var min = new Triple<>(Integer.MAX_VALUE, 0, 0);

        for (var i = 0; i < arr.length; i++)
            for (var j = 0; j < arr[0].length; j++) {
                var value = arr[i][j];

                if (value < min.getFirst()) {
                    min.setFirst(value);
                    min.setSecond(i);
                    min.setThird(j);
                }
            }

        return min;
    }

    @Override
    public void run() {
        var matrix = new int[5][4];
        for (var i = 0; i < matrix.length; i++)
            for (var j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-10, 11);
            }

        var min = getMinimum(matrix);

        var joined = Arrays
                .stream(matrix)
                .map(Arrays::toString)
                .collect(Collectors.joining(", "));

        System.out.printf("Матрица: [%s]\n", joined);
        System.out.printf("Индексы минимального значения: i = %s, j = %s\nЗначение: %s\n", min.getSecond(), min.getThird(), min.getFirst());
    }
}
