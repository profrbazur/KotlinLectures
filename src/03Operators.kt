//fun main() {
//    var x: Int
//
//    // Arithmetic Operations
//    x = 5 + 5
//    println("5 + 5 = $x") // Output: 5 + 5 = 10
//
//    x = 5 - 5
//    println("5 - 5 = $x") // Output: 5 - 5 = 0
//
//    x = 5 * 5
//    println("5 * 5 = $x") // Output: 5 * 5 = 25
//
//    x = 5 / 5
//    println("5 / 5 = $x") // Output: 5 / 5 = 1
//
//    x = 7 % 5
//    println("7 % 5 = $x") // Output: 7 % 5 = 2
//
//    //Concatenation
//    val greeting = "Hello" + " " + "World"
//    println("Concatenation: $greeting") // Output: Concatenation: Hello World
//
//    //exponentiation
//    val power = Math.pow(2.0, 3.0) // 2 raised to the power of 3
//    println("2^3 = $power") // Output: 2^3 = 8.0
//
//    //increment / decrement
//    var y = 1
//    println("Initial value of x: $y") // Output: Initial value of x: 1
//
//    y++ // Post-increment
//    println("After increment (y++): $y") // Output: After increment (x++): 2
//
//    y-- // Post-decrement
//    println("After decrement (y--): $y") // Output: After decrement (x--): 1
//
//
//}

//Assignment Operator
//fun main() {
//    var x = 10
//    println("Initial value of x: $x") // Output: Initial value of x: 10
//
//    x += 5 // x = x + 5
//    println("After x += 5: $x") // Output: After x += 5: 15
//
//    x -= 5 // x = x - 5
//    println("After x -= 5: $x") // Output: After x -= 5: 10
//
//    x *= 5 // x = x * 5
//    println("After x *= 5: $x") // Output: After x *= 5: 50
//
//    x /= 5 // x = x / 5
//    println("After x /= 5: $x") // Output: After x /= 5: 10
//
//    x %= 5 // x = x % 5
//    println("After x %= 5: $x") // Output: After x %= 5: 0
//}

//Comparison Operators
fun main() {
    val isEqual = 2 == 2
    println("2 == 2: $isEqual") // Output: 2 == 2: true

    val isNotEqual = 2 != 3
    println("2 != 3: $isNotEqual") // Output: 2 != 3: true

    val isGreaterThan = 10 > 5
    println("10 > 5: $isGreaterThan") // Output: 10 > 5: true

    val isLessThan = 5 < 10
    println("5 < 10: $isLessThan") // Output: 5 < 10: true

    val isGreaterThanOrEqual = 10 >= 10
    println("10 >= 10: $isGreaterThanOrEqual") // Output: 10 >= 10: true

    val isLessThanOrEqual = 5 <= 5
    println("5 <= 5: $isLessThanOrEqual") // Output: 5 <= 5: true
}
