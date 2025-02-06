//fun main() {
//
//if (condition) {
//    // Code to execute if the condition is true
//    }
//}


//fun main() {
//    val age = 14
//
//    if (age >= 12) {
//        println("You can enter the ride! 🎢")
//    } else {
//        println("Sorry, you're too young! ❌")
//    }
//}


//fun main() {
//    val light = "Green"
//
//    if (light == "Green") {
//        println("You can cross the road. ✅")
//    } else {
//        println("Wait for the green light. ❌")
//    }
//}


//fun main() {
//    val score = 85
//
//    if (score >= 90) {
//        println("Grade: A 🎉")
//    } else if (score >= 80) {
//        println("Grade: B 😊")
//    } else if (score >= 70) {
//        println("Grade: C 😐")
//    } else {
//        println("Grade: F 😢")
//    }
//}


//fun main() {
//    val choice = 2
//
//    when (choice) {
//        1 -> println("You ordered a Burger 🍔")
//        2 -> println("You ordered a Pizza 🍕")
//        3 -> println("You ordered Pasta 🍝")
//        else -> println("Invalid choice ❌")
//    }
//}


//fun main() {
//    val age = 20
//    val hasID = true
//
//    if (age >= 18 && hasID) {
//        println("You can watch the movie 🎬")
//    } else {
//        println("Access denied ❌")
//    }
//}

//fun main() {
//    val temperature = 32
//
//    if (temperature > 30) {
//        println("It's hot outside! ☀️")
//    } else if (temperature < 15) {
//        println("It's cold outside! ❄️")
//    } else {
//        println("The weather is normal. 🌤️")
//    }
//}


fun main() {
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    print("Enter ticket type (Regular/VIP): ")
    val ticketType = readLine()?.lowercase()

    if (age < 18) {
        println("Entry denied ❌")
    } else if (ticketType == "vip") {
        println("Welcome to the VIP section! 🎉")
    } else {
        println("Welcome! Enjoy the event! 🎶")
    }
}
