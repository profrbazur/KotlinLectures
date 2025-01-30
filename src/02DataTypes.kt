fun main() {
    // Byte
    val byteVal: Byte = 100
    println("Byte value: $byteVal") // Output: Byte value: 100

    // Short
    val shortVal: Short = 10000
    println("Short value: $shortVal") // Output: Short value: 10000

    // Int
    val intVal: Int = 100000
    println("Int value: $intVal") // Output: Int value: 100000

    // Long
    val longVal: Long = 10000000000L
    println("Long value: $longVal") // Output: Long value: 10000000000

    // Float
    val floatVal: Float = 3.14F
    println("Float value: $floatVal") // Output: Float value: 3.14

    // Double
    val doubleVal: Double = 3.14159265359
    println("Double value: $doubleVal") // Output: Double value: 3.14159265359

    // Char
    val charVal: Char = 'A'
    println("Char value: $charVal") // Output: Char value: A

    // String
    val stringVal: String = "Hello, Kotlin!"
    println("String value: $stringVal") // Output: String value: Hello, Kotlin!

    val isKotlinFun: Boolean = true
    println("Is Kotlin fun? $isKotlinFun") // Output: Is Kotlin fun? true

    val isSkyGreen: Boolean = false
    println("Is the sky green? $isSkyGreen") // Output: Is the sky green? false

    var nullableInt: Int? = null
    println("Nullable Int value: $nullableInt") // Output: Nullable Int value: null

    nullableInt = 42
    println("Nullable Int after assignment: $nullableInt") // Output: Nullable Int after assignment: 42

    val numbers: Array<Int> = arrayOf(1, 2, 3)
    println("Array values: ${numbers.joinToString()}") // Output: Array values: 1, 2, 3

    val mixedArray: Array<Any> = arrayOf(1, "Two", 3.0)
    println("Mixed Array values: ${mixedArray.joinToString()}") // Output: Mixed Array values: 1, Two, 3.0

    // List
    val list = listOf(1, 2, 3)
    println("List values: $list") // Output: List values: [1, 2, 3]

    // Mutable List
    val mutableList = mutableListOf(4, 5, 6)
    mutableList.add(7)
    println("Mutable List values: $mutableList") // Output: Mutable List values: [4, 5, 6, 7]

    // Set
    val set = setOf(1, 2, 2, 3)
    println("Set values: $set") // Output: Set values: [1, 2, 3]

    // Map
    val map = mapOf("A" to 1, "B" to 2)
    println("Map values: $map") // Output: Map values: {A=1, B=2}

    val anyVal: Any = "I can hold any value"
    println("Any value: $anyVal") // Output: Any value: I can hold any value


}

//fun sayHello(): Unit {
//    println("Hello!") // Output: Hello!
//}
//fun main() {
//    sayHello()
//}
