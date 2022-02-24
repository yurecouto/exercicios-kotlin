import kotlin.random.Random

fun main() {

    // 5 itens aleatorios em uma lista
    var lista = mutableListOf<Int>()
    for (n in 0..4) {lista.add(Random.nextInt(0, 10))}

    // indicar o maior e o menor
    var maior = 0
    var menor = 0

    var maiori = 0
    var menori = 0

    for (c in 0..(lista.size - 1)) {
        if (c == 0) {
            maior = lista[c]
            menor = lista[c]
            maiori = c
            menori = c
        }

        else {
            if (lista[c] > maior) {
                maior = lista[c]
                maiori = c
            }

            if (lista[c] < menor) {
                menor = lista[c]
                menori = c
            }
        }
    }

    println("")
    println("Lista aleatoria: ${lista}")
    println("O maior gerado pela lista é ${maior} no indice ${maiori}")
    println("O menor gerado pela lista é ${menor} no indice ${menori}")
    println("")
    
}