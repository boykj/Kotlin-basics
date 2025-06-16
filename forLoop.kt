fun main() {

    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    val fruits = listOf("apple", "banana", "kiwifruit")
    
    for (index in fruits.indices) {
        println("item at $index is ${fruits[index]}")
    }

}