fun main() {
    println(soma_par(sorteia()))
}

fun sorteia(): List<Int> {
    var dado = 0..5
    var lista = mutableListOf<Int>()

    for (c in 1..5) { lista.add(dado.random()) }

    return lista
}

fun soma_par(lista: List<Int>): Int  {
    var soma = 0

    for (n in lista) {
        if (n % 2 == 0) {
            soma += n
        }
    }

    return soma
}