package net.snezhniy.tasks.progs1.kotlin

import net.snezhniy.Utils

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