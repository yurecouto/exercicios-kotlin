fun main() {

    while (true) {
        var cont = 0

        print("Digite um numero (999 para parar): ")
        val c = readLine()!!
        var numero = c.toInt()

        if (numero == 999) {
            break
        }

        while (cont <= 10) {
            println("${numero} X ${cont} = ${numero * cont}")
            cont += 1
        }
    }
}