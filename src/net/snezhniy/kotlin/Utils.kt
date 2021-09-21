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

package net.snezhniy.kotlin

object Utils {
    /* Gives string representation of a two-dimensional array aka matrix */
    fun <T> joinTwoDimArray(arr: Array<Array<T>>): String {
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

    /* returns matrix column as array */
    inline fun <reified T> getColumn(matrix: Array<Array<T>>, colIndex: Int): Array<T> {
        val col = Array(matrix.size) { matrix[0][0] }

        for ((index, row) in matrix.withIndex()) {
            col[index] = row[colIndex]
        }

        return col
    }
}