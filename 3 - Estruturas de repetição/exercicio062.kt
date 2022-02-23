fun main() {
    print("Digite o tamanho da sequencia a ser mostrada: ")
    val r = readLine()!!
    var razao = r.toInt()

    var cont = 1

    var valA = 0
    var valB = 1

    while (cont <= razao) {
        var valC = valA + valB

        print("${valC} => ")

        valA = valB
        valB = valC

        cont += 1
    }

    print("FIM")
}