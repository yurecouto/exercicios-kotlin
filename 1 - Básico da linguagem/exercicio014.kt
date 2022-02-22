fun main() {
    print("Digite a temperatura em ºC: ")
    val cel = readLine()!!
    val celsius = cel.toInt()

    val farenheit = (celsius * 9 / 5) + 32

    print("O valor de ${celsius} celsius para farenheit é ${farenheit}")
}