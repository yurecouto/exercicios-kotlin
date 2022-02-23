fun main() {
    print("Digite tente adivinhar um numero de 1 a 10: ")
    var n = readLine()!!
    var numUser = n.toInt() 

    val opcoesAlg = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numAlg = opcoesAlg.random()

    while (numUser != numAlg) {

        if (numUser < numAlg) {
            println("Você errou, é um numero MAIOR!")
        }

        else if (numUser > numAlg) {
            println("Você errou, é um numero MENOR!")
        }

        print("Tente novamente: ")
        n = readLine()!!
        numUser = n.toInt()
    }

    println("Você acertou era o numero ${numAlg}")
}