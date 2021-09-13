package net.snezhniy.tasks.conditions

import java.util.*
import kotlin.collections.ArrayList

class ConditionsFourthButKotlin {
    fun run() {
        val arr = ArrayList<Int>()

        println("Ведите три числа")
        for (i in 0..2) {
            val input = readLine()
            if (input != null) {
                val num = input.toInt()
                arr.add(num)
            }
        }

        print("Какое действие вы хотите выполнить?\n1 -- найти наибольшее среди трёх\n-1 -- найти наименьшее среди трёх\n[1 - вариант по умолчанию]: ")
        val input = readLine()!!
        val action: Int = when (input.trim()) {
            "" -> 1
            else -> input.toInt()
        }

        when (action) {
            1 -> {
                val max = Collections.max(arr)
                println("Максимальное значение из трёх чисел: $max")
            }

            -1 -> {
                val min = Collections.min(arr)
                println("Минимальное значение из трёх чисел: $min")
            }

            else -> {
                println("Вы указали неизвестный вариант действия! Выполнение прекращено.")
            }
        }
    }
}