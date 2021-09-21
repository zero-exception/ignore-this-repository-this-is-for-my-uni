/*
 * MIT License
 *
 * Copyright (c) 2021 snezhniy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.snezhniy.kotlin.tasks.progs1

import kotlin.math.exp
import kotlin.math.sin

/*
Ввести начальное значение аргумента (xn), конечное значение аргумента
(xk), шаг (dx) - все значения тип double. Протабулировать функцию
y=exp(-x)*sin(x), т.е. для каждого значения аргумента из диапазона,
рассчитать функцию. Значения аргумента и функции вывести на консоль.
Программу написать с использованием цикла while.
*/

class Prog1 {
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
        while (x <= xk) {
            val y = calculateValues(x)
            println("x = $x, y(x) = $y")
            x += dx
        }
    }
}