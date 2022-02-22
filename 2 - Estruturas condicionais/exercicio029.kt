fun main() {
    print("Digite um numero para o teste: ")
    val t = readLine()!!
    val teste = t.toInt()

    if (teste % 2 == 0) {
        println("É um numero Par")
    }

    else {
        println("É um numero Impar")
    }
}