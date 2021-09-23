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
import net.snezhniy.java.Utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/*
№9. Заполнить двумерный массив (5х4) случайными целыми числами.
Сформировать одномерный массив, каждый элемент которого произведение
чисел в столбце исходной матрицы. Матрицу и массив вывести на консоль.
*/

public class Prog18 implements Prog {
    @Override
    public void run() {
        var matrix = new Integer[5][4];
        for (var i = 0; i < matrix.length; i++)
            for (var j = 0; j < matrix[0].length; j++)
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-10, 11);

        var columnsProducts = new BigInteger[4];
        for (int i = 0; i < columnsProducts.length; i++) {
            var column = Utils.getColumn(matrix, i)
                    .map(BigInteger::valueOf)
                    .reduce(BigInteger.ONE, BigInteger::multiply);

            columnsProducts[i] = column;
        }

        var joinedMatrix = Arrays.stream(matrix)
                .map(Arrays::toString)
                .collect(Collectors.joining(", "));

        System.out.printf("Матрица: [%s]\n", joinedMatrix);
        System.out.printf("Произведение столбоцов: %s\n", Arrays.toString(columnsProducts));
    }
}
