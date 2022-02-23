fun main() {

    println("CALCULADORA")

    println(" ")
    print("Digite o PRIMEIRO numero: ")
    var n1 = readLine()!!
    var numero1 = n1.toInt()

    print("Digite o SEGUNDO numero: ")
    var n2 = readLine()!!
    var numero2 = n2.toInt()
    println(" ")

    var opcao = 0

    while (opcao != 5) {
        println(" ")
        println("1: somar")
        println("2: multiplicar")
        println("3: maior")
        println("4: novos números")
        println("5: sair do programa")
        println(" ")

        print("Digite o que fazer com os dois numeros: ")
        var o = readLine()!!
        var opcao = o.toInt()
        println(" ")

        if (opcao == 1) {
            println("A soma é ${numero1 + numero2}")
        }

        else if (opcao == 2) {
            println("A multiplicação é ${numero1 * numero2}")
        }

        else if (opcao == 3) {
            if (numero1 > numero2) {println("A o maior é ${numero1}")}
            else {println("A o maior é ${numero2}")}
        }

        else if (opcao == 4) {
            println(" ")
            print("Digite o PRIMEIRO numero: ")
            var n1 = readLine()!!
            var numero1 = n1.toInt()
        
            print("Digite o SEGUNDO numero: ")
            var n2 = readLine()!!
            var numero2 = n2.toInt()
            println(" ")
        }

        else if (opcao == 5) {
            break
        }

        else {
            println("Operação inválida, tente novamente")
        }
    }
}