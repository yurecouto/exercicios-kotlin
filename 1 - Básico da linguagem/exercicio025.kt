fun main() {
    print("Digite o seu nome: ")
    val n = readLine()!!
    val nome = n.toString().toLowerCase()

    val delimitador = " "
    val listaNome = nome.split(delimitador)

    println("seu nome tem: ${nome.count{it == 'a'}} letras A")
    println("o primeiro A do seu nome fica no palavra ${listaNome.find{it.contains("a")}}")
    println("o ultimo A do seu nome fica na palavra ${listaNome.findLast{it.contains("a")}}")

}