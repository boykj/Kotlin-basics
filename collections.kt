fun main() {

    // Iterate over a collection
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    println("\nbreak\n")

    // Check if a collection contains an object using in operator
    val itemsTwo = listOf("banana", "apple", "banana")
    when {
        "orange" in itemsTwo        -> println("orange is in ")
        "apple" in itemsTwo         -> println("apple is in")
        "kiwifruit" in itemsTwo     -> println("kiwifruit is in")
    }

}