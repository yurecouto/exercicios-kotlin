fun main() {
    print("Digite um numero para checar se é primo: ")
    val n = readLine()!!
    val numero = n.toInt()

    var teste = 0

    // verifica os numeros divisiveis pelo numero
    for (i in 1..numero) {if (numero % i == 0) {
        teste += 1
    }}

    if (teste <= 2) {
        print("${numero} é um numero PRIMO")
    }

    else {
        print("${numero} não é um numero PRIMO")
    }
}