package net.snezhniy.kotlin.tasks.conditions

/*
 Ввести 3 числа, выдать на экран наименьшее (с поясняющим текстом)
 */

class Conditions2 {
    fun run() {
        println("Введите три разных числа:")
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val c = readLine()!!.toInt()

        val minNum = minOf(a, b, c)
        println("Минимальное число: $minNum")
    }
}