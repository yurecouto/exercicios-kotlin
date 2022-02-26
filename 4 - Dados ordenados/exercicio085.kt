fun main() {
    var pares = mutableListOf<Int>()
    var impares = mutableListOf<Int>()

    for (n in 0..6) {
        print("Digite um numero")
        var helper = readLine()!!
        var numero = helper.toInt()

        if (numero % 2 == 0) { pares.add(numero) }
        else { impares.add(numero) }
    }

    println("Os PARES")
    println(pares.sorted())

    println("Os IMPARES")
    println(impares.sorted())
}