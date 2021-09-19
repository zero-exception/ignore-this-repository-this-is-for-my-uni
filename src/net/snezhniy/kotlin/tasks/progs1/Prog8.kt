package net.snezhniy.kotlin.tasks.progs1

/*
Заполнить массив из 10 элементов случайными целыми числами.
Переписать элементы массива в обратном порядке. Вывести на консоль
исходный и преобразованный массивы.
*/

class Prog8 {
    fun run() {
        val arr = Array(10) { (-100..100).random() }
        println("Массив: [${arr.joinToString()}]")

        val reversedArr = arr.reversedArray()
        println("Перевёрнутый массив: [${reversedArr.joinToString()}]")
    }
}