fun main() {

    var soma = 0

    for (i in 0..10) {
        print("Digite um numero: ")
        var n = readLine()!!
        var numero = n.toInt()

        if (numero % 2 == 0) {
            soma += numero
        }
    }

    print("A soma de todos os pares é: ${soma}")
}