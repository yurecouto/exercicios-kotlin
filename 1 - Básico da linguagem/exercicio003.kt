fun main(args: Array<String>) {

    print("Numero 1: ")
    val numero1 = readLine()!!

    print("Numero 2: ")
    val numero2 = readLine()!!

    val soma = numero1.toInt() + numero2.toInt()

    println("A soma de $numero1 e $numero2 é: $soma")
}