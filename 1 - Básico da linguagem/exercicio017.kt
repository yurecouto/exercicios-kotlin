import kotlin.math.hypot

fun main() {
    print("Digite o primeiro cateto: ")
    val c1 = readLine()!!
    val cateto1 = c1.toInt()

    print("Digite o segundo cateto: ")
    val c2 = readLine()!!
    val cateto2 = c2.toInt()

    hypotenusa = hypot(cateto1, cateto2)

    print("A hypotenusa é: ${hypotenusa}")
}