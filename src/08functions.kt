//
//fun functionName() {
//    // Code inside the function
//}


//fun greet() {
//    println("Hello, welcome to Kotlin!")
//}
//
//fun main() {
//    greet() // Calling the function
//}



//fun makeCoffee() {
//    println("Boiling water...")
//    println("Adding coffee...")
//    println("Stirring...")
//    println("Coffee is ready! ☕")
//}
//
//fun main() {
//    makeCoffee() // Calling the function
//}


//fun makeJuice(fruit: String): String {
//    return "Here is your $fruit juice! 🥤"
//}
//
//fun main() {
//    val result = makeJuice("Mango")
//    println(result)
//}


//fun makeSandwich(bread: String, filling: String) {
//    println("Here is your $bread sandwich with $filling! 🥪")
//}
//
//fun main() {
//    makeSandwich("Wheat", "Cheese")
//}

//fun orderCoffee(type: String = "Black") {
//    println("You ordered a $type coffee ☕")
//}
//
//fun main() {
//    orderCoffee() // Uses default "Black"
//    orderCoffee("Cappuccino") // Overrides default
//}


//fun orderPizza(size: String, topping: String) {
//    println("You ordered a $size pizza with $topping 🍕")
//}
//
//fun main() {
//    orderPizza(size = "Large", topping = "Pepperoni")
//    orderPizza(topping = "Mushrooms", size = "Medium")
//}


//fun calculateTotalPrice(price: Double, tax: Double = 0.1): Double {
//    return price + (price * tax)
//}
//
//fun main() {
//    println("Total Price: $" + calculateTotalPrice(100.0)) // Default tax 10%
//    println("Total Price with 5% tax: $" + calculateTotalPrice(100.0, 0.05))
//}


fun calculateTotalPrice(price: Double, tax: Double = 0.1): Double {
    return price + (price * tax)
}

fun main() {
    print("Enter the price of the item: ")
    val priceInput = readLine() ?: "0.0" // Default to "0.0" if input is null
    val price = priceInput.toDoubleOrNull() ?: 0.0 // Convert safely to Double

    print("Enter tax rate (as a percentage, e.g., 12 for 12%) or press Enter for default 10%: ")
    val taxInput = readLine()

    val tax = if (taxInput.isNullOrEmpty()) {
        0.1 // Default tax is 10%
    } else {
        val taxValue = taxInput.toDoubleOrNull() ?: 10.0 // Convert input to Double safely
        taxValue / 100 // Convert percentage to decimal (e.g., 12 → 0.12)
    }

    val totalPrice = calculateTotalPrice(price, tax)
    println("Total Price: $${"%.2f".format(totalPrice)}")
}

