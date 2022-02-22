fun main() {
    print("Digite o inicio da PA: ")
    val i = readLine()!!
    val inicio = i.toInt()

    print("Digite a razão da PA: ")
    val r = readLine()!!
    val razao = r.toInt()

    val enesimo = inicio + ((10 - 1) * razao) + razao

    // step serve exstamente como no python
    for (n in inicio..enesimo step razao) {
        print("${n} => ")
    }

    println("FIM")
}