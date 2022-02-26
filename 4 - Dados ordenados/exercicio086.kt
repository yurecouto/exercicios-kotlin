fun main() {
    var cont = 0
    var l1 = mutableListOf<Int>()
    var l2 = mutableListOf<Int>()
    var l3 = mutableListOf<Int>()

    while (cont <= 8) {
        print("Digite um numero: ")
        var helper = readLine()!!
        var numero = helper.toInt()

        if (cont <= 2) {l1.add(numero)}
        else if (cont > 2 && cont <= 5) {l2.add(numero)}
        else if (cont > 5 && cont <= 8) {l3.add(numero)}

        cont += 1
    }

    println(l1)
    println(l2)
    println(l3)
}