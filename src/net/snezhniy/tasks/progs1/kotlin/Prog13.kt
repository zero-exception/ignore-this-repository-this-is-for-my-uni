package net.snezhniy.tasks.progs1.kotlin

import net.snezhniy.Utils

/*
Заполнить двумерный массив (5х4) случайными целыми числами.
Сформировать одномерный массив, каждый элемент которого количество
положительных чисел в столбце исходной матрицы. Матрицу и массив
вывести на консоль.
 */

class Prog13 {
    fun run() {
        val matrix = Array(5) { Array(4) { (-10L..10).random() } }
        println("Матрица: ${Utils.joinTwoDimArray(matrix)}")

        val arr = arrayListOf<Int>()
        for (j in matrix[0].indices) {
            val column = Utils.getColumn(matrix, j)
            val positives = column.filter { it > 0 }
            arr.add(positives.size)
        }

        println("Обработанный массив: ${arr.joinToString()}")
    }
}