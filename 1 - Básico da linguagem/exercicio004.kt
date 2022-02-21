fun main() {
    print("Digite qualquer numero: ")
    val dado: Number = readLine()!!

    if (dado is String) {
        println("O dado é uma String.")
    }
}