fun main() {

    var count = 0
    var sum = 0

    for (i in 0..500) {if (i % 2 != 0 && i % 3 == 0){
        sum += i
        count += 1
    }}

    println("Numeros entre 0 e 500 que são impares e divisiveis por 3")
    println("Soma:     ${sum}")
    println("Contagem: ${count}")
}