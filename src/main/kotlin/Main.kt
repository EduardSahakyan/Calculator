fun main() {
    val calculator = Calculator()

    val resultSum = calculator.add(5.0, 3.0, 2.0)
    println("Sum: $resultSum")

    val resultSubtraction = calculator.subtract(10.0, 3.0, 2.0)
    println("Sub: $resultSubtraction")

    val resultMultiplication = calculator.multiply(5.0, 3.0, 2.0)
    println("Multiply: $resultMultiplication")

    val resultDivision = calculator.divide(6.0, 3.0)
    println("Divide: $resultDivision")
}