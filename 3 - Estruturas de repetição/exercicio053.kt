fun main() {
    var menor = 0
    var maior = 0

    for (i in 1..3) {
        print("Digite um ano de nascimento: ")
        val a = readLine()!!
        val idade = 2022 - a.toInt() 

        if (idade >= 18) {
            maior += 1
        }

        else {
            menor += 1
        }
    }

    println("${maior} maiores de idade")
    println("${menor} menores de idade")
}