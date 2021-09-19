package net.snezhniy.kotlin.tasks.progs1

import java.io.IOException
import kotlin.math.exp
import kotlin.math.sin

/*
Ввести начальное значение аргумента (xn), конечное значение аргумента
(xk), шаг (dx) - все значения тип double. Протабулировать функцию
y=exp(-x)*sin(x), т.е. для каждого значения аргумента из диапазона,
рассчитать функцию. Значения аргумента и функции вывести на консоль.
Программу написать с использованием цикла for
*/

class Prog3 {
    private fun getSteps(xk: Double, xn: Double, dx: Double): Int {
        val totalSteps = (xk - xn) / dx
        if ((totalSteps % 1.0) != 0.0)
            throw IOException("Некорректное количество шагов")

        return totalSteps.toInt()
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

        try {
            val steps = getSteps(xk, xn, dx)

            var x = xn
            for (i in 0..steps) {
                val y = calculateValues(x)
                println("x = $x, y(x) = $y")
                x += dx
            }
        } catch (e: IOException) {
            println("Вы указали некорректный размер шага!")
        }
    }
}