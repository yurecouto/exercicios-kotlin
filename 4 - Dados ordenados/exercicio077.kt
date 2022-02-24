fun main() {
    val palavras = listOf("Crie", "um", "algoritmo", "que", "tenha", "uma", "tupla", "com", "várias", "palavras")
    val vogais = "aeiou"

    for (palavra in palavras) {
        print("As vogais da palavra '${palavra}' são: ")
        for (letra in palavra) {
            if (letra in vogais) {
                print("${letra}")
            }
        }
        println("")
    }
}