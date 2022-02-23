fun main() {
    print("Digite o termo da PA: ")
    val t = readLine()!!
    var termo = t.toInt()

    print("Digite a razão da PA: ")
    val r = readLine()!!
    var razao = r.toInt()

    var cont = 1

    while (cont <= 10) {
        print("${termo} => ")
        termo += razao
        cont += 1
    }

    print("Fim")
}