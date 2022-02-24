fun main() {
    var lista = mutableListOf<Int>()
    var helper = ""
    var numero = 0

    for (n in 0..9) {
        print("Digite o ${n + 1}º numero: ")
        helper = readLine()!!
        numero = helper.toInt()

        while (numero in lista) {
            print("Digite o ${n + 1}º numero: ")
            helper = readLine()!!
            numero = helper.toInt()
        }

        lista.add(numero)
    }

    println(lista.sorted())
}