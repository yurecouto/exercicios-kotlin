fun main() {
    print("Digite o numero de jogos: ")
    var helper = readLine()!!
    var numJogos = helper.toInt()
    var listaJogos = mutableListOf<String>()
    var num = 1..60

    for (n in 0..numJogos) {
        var jogo = "(${num.random()}, ${num.random()}, ${num.random()}, ${num.random()}, ${num.random()}, ${num.random()})"
        listaJogos.add(jogo)
    }

    for (j in listaJogos) {
        println(j)
    }
}