package net.snezhniy.tasks.progs1.kotlin

import net.snezhniy.Utils


/*
Заполнить двумерный массив (5х4) случайными целыми числами.
Сформировать одномерный массив, каждый элемент которого сумма чисел в
строке исходной матрицы. Матрицу и массив вывести на консоль.
 */

class Prog11 {
    fun run() {
        val arr = Array(5) { Array(4) { (-100L..100L).random() } }
        println("Матрица: ${Utils.joinTwoDimArray(arr)}")

        val aggregated = arrayListOf<Long>()
        for (row in arr.iterator()) {
            aggregated.add(row.sum())
        }

        println("Обработанный массив: [${aggregated.joinToString()}]")
    }
}