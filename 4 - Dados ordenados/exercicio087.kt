fun main() {
    var cont = 0
    var l1 = mutableListOf<Int>()
    var l2 = mutableListOf<Int>()
    var l3 = mutableListOf<Int>()
    var somaTotal = 0
    var terceiraColuna = 0

    while (cont <= 8) {
        print("Digite um numero: ")
        var helper = readLine()!!
        var numero = helper.toInt()

        if (numero % 2 == 0) { somaTotal += numero }
        if (cont == 2 || cont == 5 || cont == 8) { terceiraColuna += numero }

        if (cont <= 2) {l1.add(numero)}
        else if (cont > 2 && cont <= 5) {l2.add(numero)}
        else if (cont > 5 && cont <= 8) {l3.add(numero)}


        cont += 1
    }

    println("")
    println("Matriz")
    println(l1)
    println(l2)
    println(l3)
    println("")

    println("Soma todos os pares: ${somaTotal}")
    println("Soma terceira coluna: ${terceiraColuna}")
    println("Maior da segunda linha: ${l2.sorted()[2]}")

}