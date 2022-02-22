fun main() {
    var maior = 0
    var menor = 0

    for (i in 1..5) {
        print("Digite um peso: ")
        var p = readLine()!!
        var peso = p.toInt() 

        if (i == 1) {
            maior = peso
            menor = peso
        }

        else {
            if (peso > maior) {
                maior = peso
            }

            if (peso < menor) {
                menor = peso
            }
        }
    }

    println("${maior} é o mais pesado.")
    println("${menor} é o mais leve.")
}