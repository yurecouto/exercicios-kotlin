fun main() {
    print("Digite seu salario atual: ")
    val s = readLine()!!
    val salario = s.toInt()

    if (salario <= 1250) {
        val novoSalario = salario * 1.15
        println("Você recebeu um aumento de 15% e seu salário agora é R$:${novoSalario.toString().take(6)}")
    }


    else {
        val novoSalario = salario * 1.10
        println("Você recebeu um aumento de 10% e seu salário agora é R$:${novoSalario.toString().take(6)}")
    }
}