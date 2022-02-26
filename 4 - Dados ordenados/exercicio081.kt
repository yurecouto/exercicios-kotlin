fun main() {
    var helper = ""
    var numero = 0
    var lista = mutableListOf<Int>()
    var totalNum = 0
    var cincoNalista = false

    while (true) {
        print("Digite um numero (999 para parar): ")
        helper = readLine()!!
        numero = helper.toInt()

        lista.add(numero)
        totalNum += 1

        if (numero == 5) { cincoNalista = true }
        if (numero == 999) { break }
    }

    if (cincoNalista) {println("O numero 5 está na lista.")}
    else {println("O numero Não 5 está na lista.")}

    println("Você digitou ${totalNum} numeros")
    for (numero in lista) { println("Numero: ${numero}") }
}
