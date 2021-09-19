package net.snezhniy.kotlin.tasks.conditions

import kotlin.math.max

class Conditions1 {
    fun run() {
        print("Введите первое число: ")
        val a = readLine()!!.toInt()

        print("Введите второе число ")
        val b = readLine()!!.toInt()

        val maxNum = max(a, b)
        println("Наибольшее число: $maxNum")
    }
}