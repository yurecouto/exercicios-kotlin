fun main() {
    val lista = mutableListOf(50, 80, 64, 80 ,93, 45, 55, 100)

    println("Quantidade: ${notas(lista)["Quantidade"]}")
    println("Maior: ${notas(lista)["Maior"]}")
    println("Menor: ${notas(lista)["Menor"]}")
    println("Media: ${notas(lista)["Media"]}")
}

fun notas(lista: List<Int>): Map<String, Int> {
    val media = lista.sum() / lista.size
    var maior = 0
    var menor = 0

    for (nota in lista) {
        if (nota == lista[0]) {
            maior = nota
            menor = nota
        }

        else {
            if (nota > maior) { maior = nota }
            if (nota < menor) { menor = nota }
        }
    }

    val dict = mutableMapOf("Quantidade" to lista.size, "Maior" to maior, "Menor" to menor, "Media" to media)
    return dict
}