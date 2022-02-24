fun main() {
    println("Que valor você quer sacar? ")
    var helper = readLine()!!
    var saque = helper.toInt()
    var notas = listOf(50, 20, 10, 1)
    var cedulas = mutableListOf<Int>()
    var counter = 0

    while (saque > 0) {
        for (valor in notas) {
            cedulas.add(saque / valor)
            saque = saque % valor
            println("${cedulas[counter]} notas de R$: ${valor}")
            counter += 1
        }
    }

    counter = 0

    for (item in cedulas) {
        if (item > 0) {
            println("${item} cédulas de R$: ${notas[counter]}")
            counter += 1 
        }

    }
}