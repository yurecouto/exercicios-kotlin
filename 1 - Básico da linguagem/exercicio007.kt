fun main() {
    print("Digite a nota 1: ")
    var num = readLine()!!
    var nota1 = num.toDouble()

    print("Digite a nota 2: ")
    var num2 = readLine()!!
    var nota2 = num2.toDouble()

    var media = (nota1 * nota2) / 2

    print("A media final é ${media}")
}