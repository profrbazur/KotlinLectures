//Challenge 1
//fun listManipulation() {
//    // Step 1: Create a mutable list
//    val numbers = mutableListOf(10, 20, 30, 40, 50)
//
//    // Step 2: Add 60 to the list
//    numbers.add(60)
//
//    // Step 3: Remove 20 from the list
//    numbers.remove(20)
//
//    // Step 4: Replace the value at index 2 with 100
//    numbers[2] = 100
//
//    // Step 5: Print the final list
//    println("Final List: $numbers")
//}
//
//fun main() {
//    listManipulation()
//}

//Challenge 2
//fun setOperations() {
//    // Step 1: Create a mutable set
//    val numbers = mutableSetOf(5, 10, 15, 20)
//
//    // Step 2: Add 25 to the set
//    numbers.add(25)
//
//    // Step 3: Try adding 10 again (will not duplicate)
//    numbers.add(10)
//
//    // Step 4: Remove 15 from the set
//    numbers.remove(15)
//
//    // Step 5: Print the final set
//    println("Final Set: $numbers")
//}
//
//fun main() {
//    setOperations()
//}

//Challenge 3
fun mapOperations() {
    // Step 1: Create a mutable map
    val studentScores = mutableMapOf("Alice" to 85, "Bob" to 92, "Charlie" to 78)

    // Step 2: Add a new student "David" with a score of 88
    studentScores["David"] = 88

    // Step 3: Update "Alice"'s score to 90
    studentScores["Alice"] = 90

    // Step 4: Remove "Charlie" from the map
    studentScores.remove("Charlie")

    // Step 5: Print the final map
    println("Final Map: $studentScores")
}

fun main() {
    mapOperations()
}
