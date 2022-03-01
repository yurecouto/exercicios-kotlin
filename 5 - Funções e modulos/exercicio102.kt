fun main() {
    println(fatorial(6))
}

fun fatorial(numero: Int): Int {
    var fatorial = numero
    for (c in 1..numero) {
        fatorial *= c
    }

    return fatorial
}