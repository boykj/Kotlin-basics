fun main() {    

    var myString: String

    fun describe(obj: Any): String =

        when (obj) {
            1       -> "One"
            "Hello" -> "Greeting"
            else    -> "Unknown"
        }
    
        myString = describe(1).also{ println("Result is $it")}
        myString = describe("Hello").also{ println("Result is $it")}

}