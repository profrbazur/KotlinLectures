fun main() {
    // String to Int
    var amount: String = "123"
    val number = amount.toInt() // Convert string to an integer
    println("String to Int: $number (Type: ${number::class.simpleName})") // Output: 123 (Type: Int)

    // Int to String
    val str = number.toString() // Convert integer to a string
    println("Int to String: $str (Type: ${str::class.simpleName})") // Output: 123 (Type: String)

    // String to Double
    val decimal = "3.14".toDouble() // Convert string to a double
    println("String to Double: $decimal (Type: ${decimal::class.simpleName})") // Output: 3.14 (Type: Double)

    // Int to Boolean (is the number positive?)
    val isPositive = number > 0
    println("Int to Boolean (isPositive): $isPositive (Type: ${isPositive::class.simpleName})") // Output: true (Type: Boolean)

    // Additional Example: Double to Int
    val doubleValue = 5.99
    val intValue = doubleValue.toInt() // Convert double to integer (truncates the decimal part)
    println("Double to Int: $intValue (Type: ${intValue::class.simpleName})") // Output: 5 (Type: Int)

    // Additional Example: String to Long
    val longValue = "12345678901234".toLong() // Convert string to a long number
    println("String to Long: $longValue (Type: ${longValue::class.simpleName})") // Output: 12345678901234 (Type: Long)

    // Additional Example: String to Float
    val floatValue = "2.718".toFloat() // Convert string to a float
    println("String to Float: $floatValue (Type: ${floatValue::class.simpleName})") // Output: 2.718 (Type: Float)
}
