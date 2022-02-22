fun main() {
    print("Digite uma frase: ")
    val n = readLine()!!

    // faz uma string sem espaços e minuscula
    val frase1 = n.lowercase().replace(" ", "")

    // faz uma reversão
    val frase2 = frase1.reversed()

    if (frase1 == frase2) {
        print("Essa frase é um palindromo")
    }

    else {
        print("Essa frase Não é um palindromo")
    }
}