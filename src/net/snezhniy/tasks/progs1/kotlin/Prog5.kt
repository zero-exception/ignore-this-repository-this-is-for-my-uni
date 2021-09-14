package net.snezhniy.tasks.progs1.kotlin

/*
Заполнить массив из 10 элементов случайными целыми числами. Найти
максимальное число в массиве и вывести результат на консоль.
*/

class Prog5 {
    fun run() {
        // Иницилизация массива из 10 случайных чисел
        val arr = Array(10) { (-1000..1000).random() }
        println("Элементы массива: ${arr.joinToString()}")

        val max = arr.maxOrNull()
        println("Крупнейший элемент: $max")
    }
}