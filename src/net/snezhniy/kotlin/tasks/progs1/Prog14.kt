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

package net.snezhniy.kotlin.tasks.progs1

import net.snezhniy.kotlin.Utils

/*
Сформировать двумерный массив, в котором 5 строк, но в каждой
строке разное количество столбцов (1 строка – 3 столбца, 2 строка – 2
столбца, 3 строка – 5столбцов, 4 строка – 1 столбец, 5 строка – 6 столбцов).
Заполнить двумерный массив случайными целыми числами, подсчитать
сумму чисел в каждой строке. Вывести двумерный массив и суммы в каждой
строке на консоль.
 */

class Prog14 {
    fun run() {
        val matrix = Array(5) { Array((1..10).random()) { (-100L..100).random() } }
        println("Матрица: ${Utils.joinTwoDimArray(matrix)}")

        val rowSums = Array(matrix.size) { 0L }
        for (i in matrix.indices) {
            rowSums[i] = matrix[i].sum()
        }

        println("Суммы строк: ${rowSums.joinToString()}")
    }
}