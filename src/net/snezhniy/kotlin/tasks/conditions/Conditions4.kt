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

package net.snezhniy.kotlin.tasks.conditions

import java.util.*

class Conditions4 {
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