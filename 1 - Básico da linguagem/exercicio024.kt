fun main() {
    print("Digite o seu nome: ")
    val n = readLine()!!
    val nome = n.toString().toLowerCase()

    // Cria uma lita com a string usando o split
    val delimitador = " "
    val listaNome = nome.split(delimitador)

    println("Tem silva no nome?")
    println("silva" in listaNome)
}