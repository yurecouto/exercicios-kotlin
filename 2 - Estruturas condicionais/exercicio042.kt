fun main() {
    print("Digite sua altura: ")
    val a = readLine()!!
    val altura = a.toFloat()

    print("Digite seu peso: ")
    val p = readLine()!!
    val peso = p.toFloat()

    val imc = peso / (altura * altura)

    if (imc >= 40) {
        println("Seu IMC é de Obesidade morbida: ${imc}")
    }

    else if (40 > imc && imc >= 30) {
        println("Seu IMC é de Obesidade: ${imc}")
    }

    else if (30 > imc && imc >= 25) {
        println("Seu IMC é de Sobrepeso: ${imc}")
    }

    else if (25 > imc && imc >= 18.5) {
        println("Seu IMC é de Peso Ideal: ${imc}")
    }

    else {
        println("Seu IMC é de Abaixo do Peso: ${imc}")
    }
}