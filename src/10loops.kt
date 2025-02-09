//fun main() {
//    for (i in 1..5) {
//        println("Playing song $i 🎶")
//    }
//}
//


//fun main() {
//    var battery = 20
//
//    while (battery < 100) {
//        println("Charging... Battery at $battery% 🔋")
//        battery += 20
//    }
//    println("Battery is full! 🔋✅")
//}


//fun main() {
//    var cupsServed = 0
//
//    do {
//        println("Serving coffee cup $cupsServed ☕")
//        cupsServed++
//    } while (cupsServed < 3)
//}


//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            print("${i * j}\t") // \t for tab spacing
//        }
//        println()
//    }
//}

//fun main() {
//    for (floor in 1..3) {
//        for (room in 1..5) {
//            println("Checking availability: Floor $floor, Room $room 🏨")
//        }
//    }
//}


//fun main() {
//    for (i in 1..5) {
//        if (i == 3) break
//        println("Step $i 🚀")
//    }
//
//    for (i in 1..5) {
//        if (i == 3) continue
//        println("Continue Example: Step $i 🔄")
//    }
//}

//fun main() {
//    val groceryList = listOf("Milk", "Eggs", "Bread")
//
//    for (item in groceryList) {
//        println("Buying $item 🛒")
//    }
//}

//fun main() {
//    val orders = listOf("Burger 🍔", "Pizza 🍕", "Pasta 🍝", "Salad 🥗")
//
//    println("Processing Restaurant Orders:\n")
//
//    for (order in orders) {
//        println("Preparing: $order ✅")
//    }
//
//    println("\nAll orders are ready to be served! 🍽️")
//}

//fun main() {
//    val studentGrades = mapOf(
//        "Alice" to 90,
//        "Bob" to 85,
//        "Charlie" to 78,
//        "Diana" to 92
//    )
//
//    println("📚 Student Grades Report:\n")
//
//    for ((name, grade) in studentGrades) {
//        println("$name received a grade of $grade 🎓")
//    }
//
//    println("\nAll student grades have been processed. ✅")
//}


//Code Challenge 1
//fun main() {
//    println("⏳ Countdown Starting!")
//
//    for (i in 10 downTo 1) {
//        println("⏳ $i seconds left...")
//    }
//
//    println("Time's up! 🎉")
//}
//
//fun main() {
//    val shoppingList = listOf("Milk", "Eggs", "Bread", "Rice", "Apples")
//
//    print("Enter an item to search: ")
//    val item = readLine()?.capitalize() ?: ""
//
//    if (shoppingList.contains(item)) {
//        println("Item found! ✅")
//    } else {
//        println("Item not in the list. ❌")
//    }
//}


fun main() {
    val rows = 3
    val cols = 5
    val seats = MutableList(rows) { MutableList(cols) { "O" } } // O = Open seat

    while (true) {
        println("\n🎬 Movie Theater Seating Chart 🎭")
        for (row in seats) {
            println(row.joinToString(" "))
        }

        print("\nEnter row (1-$rows) or 0 to exit: ")
        val rowInput = readLine()?.toIntOrNull() ?: 0
        if (rowInput == 0) break // Exit program

        print("Enter column (1-$cols): ")
        val colInput = readLine()?.toIntOrNull() ?: 0

        if (rowInput in 1..rows && colInput in 1..cols) {
            if (seats[rowInput - 1][colInput - 1] == "O") {
                seats[rowInput - 1][colInput - 1] = "X"
                println("\nSeat booked successfully! ✅")
            } else {
                println("\nSeat taken! Choose another. ❌")
            }
        } else {
            println("\nInvalid input! Please try again. ⚠️")
        }
    }
}




//import kotlin.random.Random

//fun main() {
//    val totalFloors = 3
//    val roomsPerFloor = 5
//    val availableRooms = mutableListOf<String>()
//
//    for (floor in 1..totalFloors) {
//        for (room in 1..roomsPerFloor) {
//            // 80% chance of being unavailable (false), 20% chance of being available (true)
//            val isAvailable = Random.nextDouble(1.0) < 0.1
//            println("Floor $floor, Room $room - Available: $isAvailable")
//
//            if (isAvailable) {
//                availableRooms.add("Floor $floor, Room $room")
//            }
//        }
//    }
//
//    // Summary of available rooms
//    println("\nSummary of Available Rooms:")
//    if (availableRooms.isNotEmpty()) {
//        availableRooms.forEach { println(it) }
//    } else {
//        println("No rooms available.")
//    }
//}
