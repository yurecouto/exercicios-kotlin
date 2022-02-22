import kotlin.math.sqrt
fun main() {
    print("Digite um numero: ")
    val num = readLine()!!

    var numInt = num.toDouble()

    print("O dobro é: ${numInt * 2} e o triplo é ${numInt * 3} e a raiz quadrada ${sqrt(numInt)}")
}