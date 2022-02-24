fun main() {
    val numerosExtenso = listOf("Zero", "Um", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte")

    while (true) {
        print("Digite um numero para mostrar-mos em extenso: ")
        var helper = readLine()!!
        var numero = helper.toInt()

        for (num in numerosExtenso) {
            if (numerosExtenso[numero] == num) {println("O numero é: ${num}")}
        }
    }
}