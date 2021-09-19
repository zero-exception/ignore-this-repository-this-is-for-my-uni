package net.snezhniy.kotlin.tasks.progs1

/*
Заполнить массив из 10 элементов случайными целыми числами.
Подсчитать количество положительных чисел, количество отрицательных
чисел и количество чисел из диапазона -5…..+5.
*/

class Prog7 {
    fun run() {
        val arr = Array(10) { (-5..5).random() }
        println("Элементы массива: ${arr.joinToString()}")

        val positives = arr.count { it > 0 }
        println("Количество положительных: $positives")

        val negatives = arr.count { it < 0 }
        println("Количество отрицательных: $negatives")

        // Диапазон может содержать нули, но при этом нули
        // не являются положительными или отрицательными
        val zeros = arr.count { it == 0 }
        println("Количество нулей: $zeros")
    }
}