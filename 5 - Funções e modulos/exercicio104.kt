fun main() {
    leiaInt()
}

fun leiaInt(): Int {
    print("Digite um numero: ")
    var helper = readLine()!!

    while (helper.toInt() !in 0..999999999) {
        println("Digite um numero: ")
        helper = readLine()!!
        var numero = helper.toInt()
    }

    var numero = helper.toInt()
    return numero
}