package net.snezhniy.tasks.progs1.kotlin

import net.snezhniy.Utils
import java.math.BigInteger


/*
Заполнить двумерный массив (5х4) случайными целыми числами.
Сформировать одномерный массив, каждый элемент которого произведение
чисел в столбце исходной матрицы. Матрицу и массив вывести на консоль
 */

class Prog12 {
    fun run() {
        val matrix = Array(5) { Array(4) { (-100L..100L).random() } }
        println("Матрица: ${Utils.joinTwoDimArray(matrix)}")

        val arr = arrayListOf<Long>()
        for (row in matrix) {
            val product = row.reduce { acc, l -> acc * l }
            arr.add(product)
        }

        println("Массив с обработанными данными: [${arr.joinToString()}]")
    }
}