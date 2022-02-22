fun main() {
    print("O primeiro numero é: ")
    val n1 = readLine()!!
    val numero1 = n1.toInt()

    print("O segundo numero é: ")
    val n2 = readLine()!!
    val numero2 = n2.toInt()

    if (numero1 > numero2 || numero1 < numero2) {
        if (numero1 > numero2) {
            println("O numero ${numero1} é o maior")
        }

        else {
            println("O numero ${numero2} é o maior")
        }
    }

    else {
        println("OS DOIS SÃO IGUAIS")

    }
}