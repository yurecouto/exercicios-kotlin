fun main() {
    print("Digite o preço do produto: ")
    val p = readLine()!!
    val preco = p.toInt()

    println("Digite a operação: ")
    println("1 - A vista no dinheiro, 10% off: ")
    println("2 - A vista no cartão, 5% off: ")
    println("3 - 2x no Cartão, Normal: ")
    println("4 - 3x no Cartão, 10% taxa: ")
    val o = readLine()!!
    val operacao = o.toInt()

    if (operacao !in 1..4) {
        println("Operação inválida")
    }

    else {
        if (operacao == 1) {
            val vista1 = preco * 0.90
            println("O valor a vista no dinheiro com 10% off é R$:${vista1}.")
        }

        else if (operacao == 2) {
            val vista2 = preco * 0.95
            println("O valor a vista no cartão com 5% off é R$:${vista2}.")
        }

        else if (operacao == 3) {
            println("O valor em 2x no cartão é R$:${preco} em R$:${preco / 2} por parcela.")
        }

        else if (operacao == 4) {
            val taxa = preco * 1.1
            val parcela = taxa / 3
            println("O valor em 3x no cartão é R$:${taxa} em R$:${parcela} por parcela.")
        }
    }

    print("Fim da Operação")
}