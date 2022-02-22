fun main() {
    print("Digite o preço: ")
    val p = readLine()!!
    val preco = p.toDouble()

    val desconto = preco * 0.95
    print("O valor com desconto é: ${desconto}")
}