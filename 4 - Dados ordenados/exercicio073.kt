fun main() {
    var times = listOf("AMÉRICA-MG", "ATLÉTICO-MG", "ATLÉTICO-PR, BAHIA", "BOTAFOGO", "CEARÁ", "CHAPECOENSE", "CORINTHIANS", "CRUZEIRO", "FLAMENGO", "FLUMINENSE", "GRÊMIO", "INTERNACIONAL", "PALMEIRAS", "PARANÁ CLUBE", "SANTOS", "SÃO PAULO", "SPORT", "VASCO", "VITÓRIA")

    // Primeiros 5
    for (p in 0..4) {println("Primeiros 5: ${p + 1} ${times[p]}")}

    println("")

    // Ultimos 4
    for (u in 0..3) {println("Ultimos 4: ${u + 1} ${times[18 - u]}")}

    println("")

    // Ordem alfabetica
    var timesOrdem = times.sorted()
    for (item in timesOrdem) {println("Em ordem alfabetica: ${item}")}

    println("")

    // Posição chapecoense
    for (t in 0..(times.size - 1)) {
        if (times[t] == "CHAPECOENSE"){println("O CHAPECOENSE é o ${t + 1}º")}
    }
}