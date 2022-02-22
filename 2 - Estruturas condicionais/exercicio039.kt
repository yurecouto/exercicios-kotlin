fun main() {
    print("A primeira nota é: ")
    val n1 = readLine()!!
    val numero1 = n1.toInt()

    print("A segundo nota é: ")
    val n2 = readLine()!!
    val numero2 = n2.toInt()

    val media = (numero1 + numero2) / 2

    if (media >= 7) {
        println("Aluno APROVADO")
    }

    else if (5 <= media && media < 7) {
        println("Aluno de RECUPERAÇÃO")
    }

    else {
        println("Aluno RECUPERAÇÃO")
    }
}