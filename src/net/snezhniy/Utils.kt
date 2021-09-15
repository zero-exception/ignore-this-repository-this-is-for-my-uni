package net.snezhniy

object Utils {
    /* Gives string representation of a two-dimensional array aka matrix */
    fun <T> joinTwoDimArray(arr: Array<Array<T>>): String {
        var result = "["

        for ((rowIndex, row) in arr.withIndex()) {
            result += "["
            for ((columnIndex, value) in row.withIndex()) {
                result += value.toString()
                if (columnIndex != row.lastIndex) {
                    result += ", "
                }
            }

            result += "]"
            if (rowIndex != arr.lastIndex) {
                result += ", "
            }
        }

        result += "]"
        return result
    }
}