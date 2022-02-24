fun main() {
    var helper = ""
    var vezesNove = 0
    var primeiro3 = 0
    var pares = mutableListOf<Int>()
    var lista = mutableListOf<Int>()

    // Recebe os numeros
    for (n in 0..3) {
        println("Digite um numero: ")
        helper = readLine()!!
        lista.add(helper.toInt())
    }

    // Separa os pares
    for (n in lista) {if (n % 2 == 0) {pares.add(n)}}

    // Conta os 9 que aparecerem na lista
    for (n in lista) {if (n == 9) {vezesNove += 1}}

    // Diz o primeiro 3
    for (n in 0..3) {if (lista[n] == 3) {primeiro3 = n}}

    println("Existem ${vezesNove} numeros 9 na lista.")
    println("O primeiro numero 3 aparece no indice ${primeiro3}.")
    println("Os numeros pares são: ${pares}.")
}