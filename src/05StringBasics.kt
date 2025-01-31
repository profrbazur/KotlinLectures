fun main() {
    // Variable declarations
    val name = "Ryan"
    val age = 42

    // Concatenation
    val introduction = "Hello, my name is $name and I am ${age + 10} years old"
    println("Concatenation: $introduction")
    // Output: Concatenation: Hello, my name is Ryan and I am 42 years old

    // String Properties and Methods
    val s = "Hello World"

    // Length of the string
    val length = s.length
    println("Length of the string: $length")
    // Output: Length of the string: 11

    // Access value by index
    val char = s[6]
    println("Character at index 6: $char")
    // Output: Character at index 6: W

    // Slice (Substring)
    val sliced = s.slice(0..4) // Extracts characters from index 0 to 4
    println("Sliced string: $sliced")
    // Output: Sliced string: Hello

    // Replace
    val replaced = s.replace("World", "Ms. Camz")
    println("Replaced string: $replaced")
    // Output: Replaced string: Hello Ms. Camz

    // Trim (Remove leading and trailing spaces)
    val trimmed = "    Hello World    ".trim()
    println("Trimmed string: '$trimmed'")
    // Output: Trimmed string: 'Hello World'

    // Contains
    val containsHello = s.contains("Hello")
    println("Does the string contain 'Hello'? $containsHello")
    // Output: Does the string contain 'Hello'? true
}
