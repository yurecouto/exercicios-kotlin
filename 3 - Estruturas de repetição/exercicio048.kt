fun main () {
    print("Digite um numero para fazer a tabuada: ")
    val n = readLine()!!
    val numero = n.toInt()
    
    for (i in 0..10) {
        println("${numero} X ${i} = ${numero * i}")
    }
}