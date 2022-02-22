import java.util.*

fun main() {
    print("Digite um numero: ")
    val n = readLine()!!
    val numero = n.toInt()

    println("Digite a operação: ")
    println("1 para Binario: ")
    println("2 para Hexadecimal: ")
    println("3 para Octal: ")
    val o = readLine()!!
    val operacao = o.toInt()

    if (operacao !in 1..3) {
        print("Você digitou uma operação inválida.")
    }

    else {
        if (operacao == 1) {
            println("O numero ${numero} em binário é: ${Integer.toBinaryString(numero)}")
        }

        else if (operacao == 2) {
            println("O numero ${numero} em hexadecimal é: ${Integer.toHexString(numero)}")
        }

        else {
            println("O numero ${numero} em octal é: ${Integer.toOctalString(numero)}")
        }
    }

    print("FIM DO ALGORITMO")
}

