fun main() {
    val lista = listOf(5, 2, 4, 9, 6, 37, 5 ,100)
    println(maior(lista))
}

fun maior(lista: List<Int>): Int {
    var maior = 0

    for (n in lista) {
        if (n == lista[0]) { maior = n }

        else {
            if (n > maior) { maior = n }
        }
    }

    return maior
}