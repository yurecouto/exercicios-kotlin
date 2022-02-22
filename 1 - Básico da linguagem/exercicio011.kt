import kotlin.math.round

fun main() {
    print("Digite a comprimento: ")
    val comp = readLine()!!
    val comprimento = comp.toDouble()

    print("Digite a largura: ")
    val larg = readLine()!!
    val largura = larg.toDouble()

    val area = comprimento * largura

    print("A area é: ${round(area)} m²")
}