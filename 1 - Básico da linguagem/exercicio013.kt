fun main() {
    print("Digite o salario: ")
    val sal = readLine()!!
    val salario = sal.toDouble()

    val aumento = salario * 1.15
    print("O valor com aumento é: ${aumento}")
}