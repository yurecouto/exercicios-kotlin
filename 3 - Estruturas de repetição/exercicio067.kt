fun main() {

    println("Vamos jogar par ou impar")
    var vitorias = 0

    while (true) {
        println("PAR ou IMPAR (p / i): ")
        val c = readLine()!!
        var user = c.toString()

        while (user !in "pi") {
            println("PAR ou IMPAR (p / i): ")
            val c = readLine()!!
            user = c.toString()
        }

        val testeList = listOf(1, 2)
        val test = testeList.random()

        if (test == 1) {
            if (user == "i") {
                println("Você VENCEU, era Impar")
                vitorias += 1
            }

            else {
                println("Você PERDEU, era Par")
                break
            }
        }

        else {
            if (user == "p") {
                println("Você VENCEU, era Par")
                vitorias += 1
            }

            else {
                println("Você PERDEU, era Impar")
                break
            }  
        }
    }
 
    print("Você ficou invicto por ${vitorias} partidas")
}