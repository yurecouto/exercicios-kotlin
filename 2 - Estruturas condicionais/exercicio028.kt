fun main() {
    print("Digite a velocidade: ")
    val v = readLine()!!
    val velocidade = v.toInt()

    if (velocidade <= 80) {
        print("Você está abaixo do limite, Dirija com cuidado!")
    }

    else {
        val multa = (velocidade - 80) * 7

        print("Você excedeu a velocidade! Sua multa é de R$:${multa.toDouble()}")
    }
}