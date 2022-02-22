fun main() {
    print("Digite um numero: ")
    val n = readLine()!!
    val numero = n.toInt()

    val u = numero / 1 % 10
    val d = numero / 10 % 10
    val c = numero / 100 % 10
    val m = numero / 1000 % 10

    println("Unidade: ${u}, Dezena: ${d}, Centena: ${c}, Milhar ${m}")
}