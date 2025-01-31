fun main() {

   //List Immutable (Read Only)
//    val numbers = listOf(1, 2, 3, 4, 5) // Read-only list
//    println("List: $numbers") // Output: List: [1, 2, 3, 4, 5]
//    println("First element: ${numbers.first()}") // Output: First element: 1
//    println("Last element: ${numbers.last()}") // Output: Last element: 5
//    println("Element at index 2: ${numbers[2]}") // Output: Element at index 2: 3
//    println("List size: ${numbers.size}") // Output: List size: 5


    //List Mutable (Modifiable)
//    val names = mutableListOf("Ryan", "Alice", "Bob") // Mutable list
//    println("Original List: $names") // Output: Original List: [Ryan, Alice, Bob]
//
//    names.add("Charlie") // Add element
//    println("After Add: $names") // Output: [Ryan, Alice, Bob, Charlie]
//
//    names.remove("Alice") // Remove element
//    println("After Remove: $names") // Output: [Ryan, Bob, Charlie]
//
//    names[1] = "David" // Modify element
//    println("After Modification: $names") // Output: [Ryan, David, Charlie]

    //Sets - Immutable
//    val uniqueNumbers = setOf(1, 2, 3, 3, 4)
//    println("Set: $uniqueNumbers") // Output: Set: [1, 2, 3, 4]
//    println("Contains 3? ${uniqueNumbers.contains(3)}") // Output: true

    //Mutable Set
//    val numbers = mutableSetOf(1, 2, 3)
//    println("Original Set: $numbers") // Output: [1, 2, 3]
//
//    numbers.add(4)
//    println("After Add: $numbers") // Output: [1, 2, 3, 4]
//
//    numbers.remove(2)
//    println("After Remove: $numbers") // Output: [1, 3, 4]

    //Maps Immutable (Read Only)
//    val user = mapOf("name" to "Ryan", "age" to 30)
//    println("Map: $user") // Output: {name=Ryan, age=30}
//    println("User's name: ${user["name"]}") // Output: Ryan

    //Immutable Maps
//    val studentScores = mutableMapOf("Alice" to 95, "Bob" to 88)
//
//    studentScores["Charlie"] = 90 // Add key-value pair
//    println("Updated Map: $studentScores") // Output: {Alice=95, Bob=88, Charlie=90}
//
//    studentScores.remove("Bob") // Remove key-value pair
//    println("After Remove: $studentScores") // Output: {Alice=95, Charlie=90}

    //Collection Functions
//    val numbers = listOf(10, 20, 30, 40, 50)
//    val filteredNumbers = numbers.filter { it > 20 }
//    println("Filtered List: $filteredNumbers") // Output: [30, 40, 50]

    //Mapping Elements (transforming Data)
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val squaredNumbers = numbers.map { it * it }
//    println("Squared Numbers: $squaredNumbers") // Output: [1, 4, 9, 16, 25]

////    Finding Elements
//    val numbers = listOf(5, 10, 15, 20)
//
//    println("First element > 10: ${numbers.first { it > 10 }}") // Output: 15
//    println("Last element < 20: ${numbers.last { it < 20 }}") // Output: 15

//    //Sorting a list
//    val numbers = listOf(4, 2, 9, 1, 5)
//    println("Sorted List: ${numbers.sorted()}") // Output: [1, 2, 4, 5, 9]

//    Reduce and Fold

//    val numbers = listOf(1, 2, 3, 4, 5)
//
//    val sum = numbers.reduce { acc, num -> acc + num }
//    println("Sum using reduce: $sum") // Output: 15
//
//    val product = numbers.fold(1) { acc, num -> acc * num }
//    println("Product using fold: $product") // Output: 120

    val fruits = listOf("Apple", "Banana", "Orange")
    println(fruits) // Output: [Apple, Banana, Orange]

    val names = mutableListOf("Alice", "Bob")
    names.add("Charlie")
    println(names) // Output: [Alice, Bob, Charlie]

}
