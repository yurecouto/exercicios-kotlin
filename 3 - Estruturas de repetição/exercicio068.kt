fun main() {

    var helper = " "
    var mais18 = 0
    var homens = 0
    var mulheres20 = 0
    var continuar = "s"

    while (continuar in "sS") {
        println("Digite um nome: ")
        helper = readLine()!!
        var nome = helper.toString()

        println("Digite uma idade: ")
        helper = readLine()!!
        var idade = helper.toInt()

        println("Digite um sexo: ")
        helper = readLine()!!
        var sexo = helper.toString()

        while (sexo !in "MmFf"){
            println("Digite um sexo: ")
            helper = readLine()!!
            var sexo = helper.toString()
        }

        println("Cadastrar mais um? (s / n): ")
        helper = readLine()!!
        continuar = helper.toString()

        while (continuar !in "sSnN"){
            println("Cadastrar mais um? (s / n): ")
            helper = readLine()!!
            var continuar = helper.toString()
        }

        if (idade >= 18) {
            mais18 += 1
        }

        if (sexo in "mM") {
            homens += 1
        }

        else {
            if (idade < 20) {
                mulheres20 += 1
            }
        }
    }

    println("Existem ${mais18} maiores de idade")
    println("Existem ${homens} homens")
    println("Existem ${mulheres20} mulheres com menos de 20")
}