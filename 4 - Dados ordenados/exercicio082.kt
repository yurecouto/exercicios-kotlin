fun main() {
    var listaPar = mutableListOf<Int>()
    var listaImpar = mutableListOf<Int>()

    while (true) {
        print("Digite um numero: ")
        var helper = readLine()!!
        var numero = helper.toInt()

        if (numero % 2 == 0) {listaPar.add(numero)}
        else {listaImpar.add(numero)}

        if (numero == 999) { break }
    }

    println("Lista dos numero PARES digitados: ")
    println(listaPar)
    println("Lista dos numero IMPARES digitados: ")
    println(listaImpar)
}