fun main() {

    var contador = 0
    var soma = 0

    while (true) {
        print("Digite um numero (999 para parar): ")
        val c = readLine()!!
        var continuar = c.toInt()

        if (continuar == 999) {
            break
        }

        contador += 1
        soma += continuar
    }
    
    println("Voce digitou ${contador} e a soma deles é ${soma}.")
}