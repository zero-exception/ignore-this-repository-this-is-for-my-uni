package net.snezhniy.tasks.progs1.kotlin

import net.snezhniy.Utils
import java.io.IOException


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