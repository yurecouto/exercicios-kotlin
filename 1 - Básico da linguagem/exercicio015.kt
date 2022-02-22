fun main() {
    print("Digite os dias com o carro: ")
    val d = readLine()!!
    val dias = d.toInt()

    print("Digite os kilometros rodados: ")
    val k = readLine()!!
    val kilometros = k.toInt()

    val valor = (60 * dias) + (0.15 * kilometros)

    print("O valor do aluguel do carro é: R$ ${valor}")
}