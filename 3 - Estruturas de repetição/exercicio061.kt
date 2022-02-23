fun main() {
    print("Digite o termo da PA: ")
    val t = readLine()!!
    var termo = t.toInt()

    print("Digite a razão da PA: ")
    val r = readLine()!!
    var razao = r.toInt()

    var cont = 1
    var mais = 1

    while (mais != 0) {
        while (cont <= 10) {
            print("${termo} => ")
            termo += razao
            cont += 1
        }

        cont = 1

        println("Mostrar mais termos? (0 para parar) : ")
        val m = readLine()!!
        var mais = m.toInt()
    }


    print("Fim")
}