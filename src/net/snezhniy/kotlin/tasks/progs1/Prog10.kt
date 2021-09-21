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

/*
Заполнить двумерный массив (матрицу) размером 5 строк, 4 столбца
(5х4) случайными целыми числами. Найти минимальное число в матрице и
его индексы, т.е. номер строки и столбца. Вывести исходную матрицу и
найденные индексы на консоль.
*/

class Prog10 {
    private fun <T> joinTwoDimArray(arr: Array<Array<T>>): String {
        var result = "["

        for ((rowIndex, row) in arr.withIndex()) {
            result += "["
            for ((columnIndex, value) in row.withIndex()) {
                result += value.toString()
                if (columnIndex != row.lastIndex) {
                    result += ", "
                }
            }

            result += "]"
            if (rowIndex != arr.lastIndex) {
                result += ", "
            }
        }

        result += "]"
        return result
    }

    private fun <T : Comparable<T>> getMin(arr: Array<Array<T>>): Triple<T, Int, Int> {
        var min: T = arr[0][0]
        var rowIndex = 0
        var columnIndex = 0

        for ((i, row) in arr.withIndex())
            for ((j, value) in row.withIndex()) {
                if (value < min) {
                    min = value
                    rowIndex = i
                    columnIndex = j
                }
            }

        return Triple(min, rowIndex, columnIndex)
    }

    fun run() {
        val arr = Array(5) { Array(4) { (-10..10).random() } }
        println("Матрица: ${joinTwoDimArray(arr)}")

        val (min, i, j) = getMin(arr)
        println("Минимальное число: $min\nИндекс строки: $i\nИндекс столбца: $j")
    }
}