fun main() {

    var helper = ""
    var produtoNome = ""
    var produtoPreco = 0

    var totalGasto = 0
    var maisMil = 0
    var maisBaratoNome = ""
    var maisBaratoPreco = 0
    var continuar = 1

    while (continuar != 999) {
        print("Digite o nome: ")
        helper = readLine()!!
        produtoNome = helper.toString()

        print("Digite o preço: ")
        helper = readLine()!!
        produtoPreco = helper.toInt()

        print("Comprar outro?(Digite 999 para parar) ")
        helper = readLine()!!
        continuar = helper.toInt()

        // Separa o mais barato
        if (totalGasto == 0) {
            maisBaratoPreco = produtoPreco
            maisBaratoNome = produtoNome
        }

        else {
            if (produtoPreco < maisBaratoPreco) {
                maisBaratoPreco = produtoPreco
                maisBaratoNome = produtoNome
            }
        }

        // Soma todos os gastos
        totalGasto += produtoPreco

        // Conta quantos custam mais que mil
        if (produtoPreco >= 1000) {
            maisMil += 1
        }
    }

    println("")
    println("Você comprou um total de R$: ${totalGasto}.")
    println("O item mais barato é ${maisBaratoNome}, custando R$: ${maisBaratoPreco}.")
    println("E ${maisMil} itens custam mais do que 1000 reais.")
    println("")
}