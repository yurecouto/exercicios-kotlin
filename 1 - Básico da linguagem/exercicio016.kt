fun main() {
    print("Digite um numero Real: ")
    val r = readLine()!!
    val real = r.toDouble()

    val inteiro = real.toInt()

    print("O valor real ${real} em inteiro é: ${inteiro}")
}