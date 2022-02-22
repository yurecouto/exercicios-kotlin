fun main() {
    var numeros = mutableListOf<Int>()

    for (a in 1..3){
        print("Digite um numero: ")
        var n = readLine()!!
        var numero = n.toInt()

        numeros.add(numero)
    }

    if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
        print("O maior é: ${numeros[0]}")
    }

    else {
        if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
            print("O maior é: ${numeros[1]}")
        }

        else {
            print("O maior é: ${numeros[2]}")
        }
    }
}