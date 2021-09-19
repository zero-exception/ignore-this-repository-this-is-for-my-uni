package net.snezhniy.kotlin.tasks.progs1

/*
Заполнить массив из 10 элементов случайными целыми числами. Найти
индекс минимального числа в массиве и вывести его на консоль.
*/

class Prog6 {
    fun run() {
        val arr = Array(10) { (-100..100).random() }
        println("Элементы массива: ${arr.joinToString()}")

        val min = arr.minOrNull()
        val minIndex = arr.indexOf(min)
        println("Индекс минимального числа: $minIndex (само число $min)")
    }
}