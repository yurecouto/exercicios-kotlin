fun main() {
    var continuar = "s"
    var listaNome = mutableListOf<String>()
    var nota1Lista = mutableListOf<Int>()
    var nota2Lista = mutableListOf<Int>()

    while (continuar !in "nN") {
        print("Digite o nome do aluno: ")
        var nome = readLine()!!

        print("Digite a primeira nota: ")
        var helper = readLine()!!
        var n1 = helper.toInt()

        print("Digite a primeira nota: ")
        helper = readLine()!!
        var n2 = helper.toInt()

        listaNome.add(nome)
        nota1Lista.add(n1)
        nota2Lista.add(n2)

        print("Cadastrar mais um?: ")
        continuar = readLine()!!
    }

    for (a in 0..(listaNome.size - 1)) { println("Aluno: ${listaNome[a]}, Nota 1: ${nota1Lista[a]}, Nota 2: ${nota2Lista[a]}, Media: ${nota1Lista[a] + nota2Lista[a] / 2}") }
}