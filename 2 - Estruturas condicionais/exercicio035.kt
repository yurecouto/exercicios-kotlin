fun main() {
    print("Digite o valor da casa: ")
    val c = readLine()!!
    val casa = c.toInt()

    print("Digite o seu salario: ")
    val s = readLine()!!
    val salario = s.toInt()

    print("Digite o tempo a parcelar: ")
    val p = readLine()!!
    val prestacao = casa / (p.toInt() * 12)

    if (prestacao > (salario * 0.3)) {
        print("Seu salario não condiz com a nossa formula, e por isso o financiamento foi NEGADO!")
    }

    else {
        print("Seu salario condiz com a nossa formula, e por isso o financiamento foi ACEITO!")
    }
}