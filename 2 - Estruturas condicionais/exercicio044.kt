fun main() {
    println("Vamos jogar JO KEN PO!")
    println("1 - jogue - PEDRA")  
    println("2 - jogue - PAPEL")
    println("3 - jogue - TESOURA")
    // Jogada do usuario
    val u = readLine()!!
    val user = u.toInt()

    // Jogada do computador
    val listAlg = listOf(1, 2, 3)
    val alg = listAlg.random()

    if (user !in 1..3) {
        print("Operação incorreta")
    }

    else if (user == 1) {
        when (alg) {
            1 -> println("Empatamos! Joguei PEDRA e você PEDRA")
            2 -> println("Eu venci! Joguei PAPEL e você PEDRA")
            3 -> println("Você Venceu! Joguei TESOURA e você PEDRA")
        }
    }

    else if (user == 2) {
        when (alg) {
            1 -> println("Você Venceu! Joguei PEDRA e você PAPEL")
            2 -> println("Empatamos! Joguei PAPEL e você PAPEL")
            3 -> println("Você Perdeu! Joguei TESOURA e você PAPEL")
        }
    }

    else if (user == 3) {
        when (alg) {
            1 -> println("Você Perdeu! Joguei PEDRA e você TESOURA")
            2 -> println("Você Venceu! Joguei PAPEL e você TESOURA")
            3 -> println("Empatamos! Joguei TESOURA e você TESOURA")
        }
    }

    print("Fim do jogo")

}