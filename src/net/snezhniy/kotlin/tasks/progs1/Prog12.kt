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
Заполнить двумерный массив (5х4) случайными целыми числами.
Сформировать одномерный массив, каждый элемент которого произведение
чисел в столбце исходной матрицы. Матрицу и массив вывести на консоль
 */

class Prog12 {
    private inline fun <reified T> getColumn(matrix: Array<Array<T>>, colIndex: Int): Array<T> {
        val col = Array(matrix.size) { matrix[0][0] }

        for ((index, row) in matrix.withIndex()) {
            col[index] = row[colIndex]
        }

        return col
    }

    fun run() {
        val matrix = Array(5) { Array(4) { (-100L..100L).random() } }
        println("Матрица: ${Utils.joinTwoDimArray(matrix)}")

        val arr = arrayListOf<Long>()
        for (j in matrix[0].indices) {
            val column = getColumn(matrix, j)
            val product = column.reduce { acc, l -> acc * l }
            arr.add(product)
        }

        println("Массив с обработанными данными: [${arr.joinToString()}]")
    }
}