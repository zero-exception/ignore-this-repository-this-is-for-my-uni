package net.snezhniy.kotlin.tasks.progs1

/*
Заполнить массив из 10 элементов случайными целыми числами.
Осуществить сортировку массива методом пузырька. Т.е. расположить числа
в массиве по возрастанию. Вывести преобразованный массив на консоль
 */

class Prog9 {
    fun run() {
        val arr = Array(10) { (-100..100).random() }
        println("Массив: [${arr.joinToString()}]")

        arr.sort()
        println("Отсортированный массив: [${arr.joinToString()}]")
    }
}