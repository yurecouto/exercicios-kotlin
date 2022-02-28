fun main() {
    escreva("MEU NOME É YURE")
}

fun escreva(mensagem: String) {
    for (d in 0..mensagem.length-1) {
        print("=")
    }

    println("")
    println(mensagem)

    for (d in 0..mensagem.length-1) {
        print("=")
    }
}