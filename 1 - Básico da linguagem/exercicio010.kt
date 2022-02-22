import kotlin.math.round

fun main() {
    print("Digite o valor em R$: ")
    val num = readLine()!!
    val reais = num.toDouble()

    val dolar = reais / 5.10

    print("$O valor de {reais} Reais é igial a ${dolar} dolares.")
}