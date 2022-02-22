fun main() {
    print("Digite o nome de sua cidade: ")
    val c = readLine()!!
    val cidade = c.toString()

    // Cria uma lita com a string usando o split
    val delimitador = " "
    val listaCidade = cidade.split(delimitador)

    println("A cidade começa com santo?")
    println(listaCidade[0].toLowerCase() == "santo")
}