fun main() {
    print("Digite uma frase: ")
    val f = readLine()!!
    val frase = f.toString()

    println("Frase em maiusculo: ${frase.toUpperCase()}")
    println("Frase em minusculo: ${frase.toLowerCase()}")
    println("Quantidade de letras: ${frase.length}")
}