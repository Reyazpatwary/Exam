fun main() {
    val input = 20

    val sami = mutableListOf<Int>()
    val dami = mutableListOf<Int>()

    var samiTurn = true

    for (i in 1..input) {
        if (i % 2 == 0) {
            dami.add(i)
        } else {
            sami.add(i)
        }
        samiTurn = !samiTurn
    }

    println("Sami: ${sami.joinToString(", ")}")
    println("Dami: ${dami.joinToString(", ")}")
}
