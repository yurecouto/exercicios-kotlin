fun main() {
    print("Tente adivinhar o numero em que eu estou pensando (1 a 5): ")
    val n = readLine()!!
    val numero = n.toInt()

    val lista = listOf<Int>(1, 2, 3, 4, 5)
    val aleatorio = lista.random()

    if(numero == aleatorio) {
        println("Você acertou, eu pensei em: ${aleatorio}")
    }

    else {
        println("Você errou, eu pensei em: ${aleatorio}")
    }

}