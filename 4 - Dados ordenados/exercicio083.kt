fun main() {
    print("Digite a expressão: ")
    val exprecao = readLine()!!

    var abertos = 0
    var fechados = 0

    for (c in exprecao) {
        if (c.toString() == "(") { abertos += 1 }
        else if (c.toString() == ")") { fechados += 1 }
    }

    if (abertos == fechados) { println("A espressão é VERDADEIRA") }
    else {println("A expressão é FALSA")}
}