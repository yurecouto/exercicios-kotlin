fun main() {
    voto(2000)
}

fun voto(ano: Int): String {
    val idade = 2022 - ano

    if (idade < 16) { return "Ainda não vota" }
    else if (idade == 16 || idade < 18) { return "Voto Opcional" }
    else if (idade in 18..59) { return "Voto Obtigatorio" }

}