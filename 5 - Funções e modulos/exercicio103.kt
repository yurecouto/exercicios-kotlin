fun main() {
    println(ficha())
}

fun ficha(nome: String = "Unknown", idade: Int = 0): String {
    return "O jogador ${nome} fez ${idade} gols."
}