class Calculator {

    fun add(vararg numbers: Double): Double {
        return numbers.sum()
    }

    fun subtract(vararg numbers: Double): Double {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("At least one number is required for subtraction")
        }
        var result = numbers[0]
        for (i in 1 until numbers.size) {
            result -= numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Double): Double {
        return if (numbers.isEmpty()) {
            throw IllegalArgumentException("At least one number is required for multiplication")
        } else {
            numbers.reduce { acc, next -> acc * next }
        }
    }

    fun divide(vararg numbers: Double): Double {
        if (numbers.isEmpty()) {
            throw IllegalArgumentException("At least one number is required for division")
        }
        if (numbers.any { it == 0.0 }) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        var result = numbers[0]
        for (i in 1 until numbers.size) {
            result /= numbers[i]
        }
        return result
    }
}