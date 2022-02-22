fun main() {
    print("Digite um valor em metros: ")
    val num = readLine()!!
    val metro = num.toInt()
    val centimetro = metro * 100
    val milimetro = metro * 1000

    println("O valor de ${metro} metros equivale a ${centimetro} centimetros e ${milimetro} milimetros.")
}