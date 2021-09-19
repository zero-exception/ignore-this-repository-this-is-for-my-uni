package net.snezhniy.kotlin.tasks.progs1

/*
Создать и проинициализировать массив из 10 целых чисел. Рассчитать
сумму элементов массива и их произведение и вывести результаты на
консоль.
*/

class Prog4 {
    fun run() {
        // Иницилизация массива из 10 случайных чисел
        val arr = Array(10) { (-1000..1000).random().toBigInteger() }
        println("Элементы массива: ${arr.joinToString()}")

        val sum = arr.reduce { acc, i -> acc + i }
        println("Сумма элементов: $sum")

        val prod = arr.reduce { acc, i -> acc * i }
        println("Произведение элементов: $prod")
    }
}