fun main() {

    var continuar = 0
    var dadosAlunos = mutableMapOf("Nome" to 100)
    
    while (continuar != 999) {
        print("Digite o nome do aluno: ")
        var aluno = readLine()!!

        print("Digite a nota do aluno: ")
        var helper = readLine()!!
        var nota = helper.toInt()

        dadosAlunos.put(aluno, nota)

        print("Cadastrar mais um aluno? (999) ")
        helper = readLine()!!
        continuar = helper.toInt()
    }

    continuar = 0

    while (continuar != 999) {
        println("Consultar nota do aluno")
        print("Digite o nome do aluno: ")
        var aluno = readLine()!!

        if (aluno in dadosAlunos.keys) {
            println("A media do aluno ${aluno} é: ${dadosAlunos[aluno]}")
        }

        else {
            println("Aluno não cadastrado.")
        }

        print("Consultar mais um aluno? (999) ")
        var helper = readLine()!!
        continuar = helper.toInt()
    }
}