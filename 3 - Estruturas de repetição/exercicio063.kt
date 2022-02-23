fun main() {
    var continuar = 0
    var contador = 0
    var soma = 0

    while (contador != 999) {
        print("Digite um numero (999 para parar): ")
        val c = readLine()!!
        continuar = c.toInt()

        if (continuar == 999) {
            break
        }

        contador += 1
        soma += continuar
    }

    println("Voce digitou ${contador} e a soma deles é ${soma}.")

}