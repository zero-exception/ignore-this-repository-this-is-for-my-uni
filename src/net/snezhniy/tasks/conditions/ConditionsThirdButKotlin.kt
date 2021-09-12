package net.snezhniy.tasks.conditions

class ConditionsThirdButKotlin {
    fun run() {
        println("Укажите числа стороны трегольника.\nВведите первое число:")
        val a = readLine()?.trim()?.toInt()

        println("Введите второе число:")
        val b = readLine()?.trim()?.toInt()

        println("Введите третье число:")
        val c = readLine()?.trim()?.toInt()

        if (a != null && b != null && c != null)
            if (a + b > c && b + c > a && c + a > b)
                println("Числа могут являться сторонами треугольника!")
            else
                println("Числа не могут быть сторонами треугольника.")
    }
}