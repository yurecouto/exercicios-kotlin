fun main() {

    var numero = 10
    var contador = numero -1

    while (contador > 0) {
        numero *= contador
        contador -= 1
        print("${numero} => ")
    }

    print("Fim")
}