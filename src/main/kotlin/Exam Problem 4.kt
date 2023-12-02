import java.util.Scanner

fun main(args: Array<String>) {
    var src = Scanner(System.`in`)
    var score =src.nextInt()
    if (90 <= score && score <= 100){
        println("A")
    } else if (80 <= score && score < 89){
        println("B")
    }else if(70 <= score && score < 79){
        println("C")
    }else if(60 <= score && score < 69){
        println("D")

    }else if(1 <= score && score < 59) {
        println("F")
    }}
//Md. Sharifullah Patwary
