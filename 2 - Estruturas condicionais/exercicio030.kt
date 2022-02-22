fun main() {
    print("Digite a distancia da viagem em km: ")
    val d = readLine()!!
    val distancia = d.toInt()

    if (distancia <= 200) {
        var preco = distancia * 0.5
        print("O preço da viagem é: ${preco}")
    }

    else {
        var preco = distancia * 0.45
        print("O preço da viagem é: ${preco}")
    }
}