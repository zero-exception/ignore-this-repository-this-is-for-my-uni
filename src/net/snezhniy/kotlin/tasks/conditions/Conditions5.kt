package net.snezhniy.kotlin.tasks.conditions

import java.util.Collections
import kotlin.collections.ArrayList

class Conditions5 {

    fun run() {
        val arr = ArrayList<Int>()

        println("Ведите три числа")
        for (i in 0..2) {
            val input = readLine()!!
            val num = input.toInt()
            arr.add(num)
        }

        print("Какое действие вы хотите выполнить?\n1 -- найти наибольшее среди трёх\n-1 -- найти наименьшее среди трёх\n[1 - вариант по умолчанию]: ")
        val input = readLine()!!
        val action: Int = when {
            input.isEmpty() -> 1
            else -> input.toInt()
        }

        println("\nИнформация об указанных числах:")
        for (num in arr.iterator()) {
            val positiveOrNegative = when {
                num > 0 -> "положительное"
                num == 0 -> "не положительное и не отрицательное"
                else -> "отрицательное"
            }

            val evenOrOdd = when (num.mod(2)) {
                0 -> "чётное"
                else -> "нечётное"
            }

            val greaterOrEqualOrSmallerThanTen = when {
                num > 10 -> "больше десяти"
                num == 10 -> "равно десяти"
                else -> "меньше десяти"
            }

            val toPrint = " • Число $num $positiveOrNegative, $evenOrOdd и $greaterOrEqualOrSmallerThanTen"
            println(toPrint)

        }

        when (action) {
            1 -> {
                val max = Collections.max(arr)
                println("\nМаксимальное значение из трёх чисел: $max")
            }

            -1 -> {
                val min = Collections.min(arr)
                println("\nМинимальное значение из трёх чисел: $min")
            }

            else -> {
                println("\nВы указали неизвестный вариант действия! Выполнение прекращено.")
            }
        }
    }
}