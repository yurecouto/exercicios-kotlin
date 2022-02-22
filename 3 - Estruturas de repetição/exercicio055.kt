fun main() {
    var somaIdades = 0
    var idades = 0
    var maisVelho = 0
    var maisVelhoNome = ""
    var mulheres20 = 0

    for (i in 1..5) {
        print("Digite um nome: ")
        var n = readLine()!!
        var nome = n.toString() 

        print("Digite uma idade: ")
        var id = readLine()!!
        var idade = id.toInt() 

        print("Digite o sexo (m/f): ")
        var s = readLine()!!
        var sexo = s.toString()
        
        // media idade
        somaIdades += idade
        idades += 1

        // Homem mais velho
        if (sexo == "m") {
            if (i == 1) {
                maisVelho = idade 
                maisVelhoNome = nome
            }

            else {
                if (idade > maisVelho) {
                    maisVelho = idade
                    maisVelhoNome = nome
                }
            }
        }

        // mulheres menos de 20
        if (sexo == "f") {
            if (idade < 20) {
                mulheres20 += 1
            }
        }
        
        println("")
    }

    println("A media de idade do grupo é ${somaIdades / idades}.")
    println("O homem mais velho é o: ${maisVelhoNome} com ${maisVelho} anos.")
    println("Tem ${mulheres20} mulheres com menos de 20 anos.")
}