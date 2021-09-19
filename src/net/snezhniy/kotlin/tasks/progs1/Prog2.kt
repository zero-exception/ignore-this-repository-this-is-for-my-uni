package net.snezhniy.kotlin.tasks.progs1

import kotlin.math.exp
import kotlin.math.sin

/*
Ввести начальное значение аргумента (xn), конечное значение аргумента
(xk), шаг (dx) - все значения тип double. Протабулировать функцию
y=exp(-x)*sin(x), т.е. для каждого значения аргумента из диапазона,
рассчитать функцию. Значения аргумента и функции вывести на консоль.
Программу написать с использованием цикла do-while.
*/

class Prog2 {
    private fun isValidStep(xn: Double, xk: Double, dx: Double): Boolean {
        val totalSteps = (xk - xn) / dx
        return (totalSteps % 1.0) == 0.0
    }

    private fun calculateValues(x: Double): Double {
        return exp(-x) * sin(x)
    }

    fun run() {
        print("Укажите начальное значение аргумента (xn): ")
        val xn = readLine()!!.toDouble()

        print("Укажите конечное значение аргумента (xk): ")
        val xk = readLine()!!.toDouble()

        print("Укажите размер шага (dx): ")
        val dx = readLine()!!.toDouble()

        if (!isValidStep(xn, xk, dx)) {
            return println("Вы указали некорректное количество шагов.")
        }

        var x = xn

        do {
            val y = calculateValues(x)
            println("x = $x, y(x) = $y")
            x += dx
        } while (x <= xk)
    }
}