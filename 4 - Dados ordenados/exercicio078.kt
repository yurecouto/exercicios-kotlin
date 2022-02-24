fun main() {

    var lista = mutableListOf<Int>()
    var helper = ""

    for (n in 0..4) {
        print("Digite um numero: ")
        helper = readLine()!!
        lista.add(helper.toInt())
    }

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

    println("O numero MAIOR é: ${maior}, e fica no indice ${maiori}.")
    println("O numero MENOR é: ${menor}, e fica no indice ${menori}.")
}