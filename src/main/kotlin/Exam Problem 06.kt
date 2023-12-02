import java.util.*
fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    var num1: Int = reader.nextInt()

    var n = 5
    var fact = 1
    for (i in 1..n) {
        fact *= i//fact = fact*i
    }

    println("Factorial is: $fact")
}
//Md. Sharifullah Patwary
