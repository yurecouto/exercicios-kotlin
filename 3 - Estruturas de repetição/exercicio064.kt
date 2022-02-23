fun main() {
    var continuar = 0
    var contador = 0
    var soma = 0

    var maior = 0
    var menor = 0

    while (contador != 999) {
        print("Digite um numero (999 para parar): ")
        val c = readLine()!!
        continuar = c.toInt()

        if (contador == 0) {
            maior = continuar
            menor = continuar
        }

        else {
            if (continuar > maior) {
                maior = continuar
            }

            if (continuar < menor) {
                menor = continuar
            }
        }


        contador += 1
        soma += continuar
    }

    val media = soma / contador

    println("Voce digitou ${contador} e a soma deles é ${soma}.")
    println("O maior é ${maior} e o menor é ${menor}.")
    println("A media deles é ${media.toFloat()}.")

}