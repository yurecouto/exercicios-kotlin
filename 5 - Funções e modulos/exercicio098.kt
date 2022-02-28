fun main() {
    println(contador(1, 20, 2))
}

fun contador(inicio: Int, fim: Int, passo: Int): List<Int> {
    var passoTeste = passo
    var lista = mutableListOf<Int>()

    if (passoTeste < 0) { passoTeste *= -1 }
    if (passoTeste == 0) { passoTeste = 1 }

    if (inicio < fim) {
        val cont = inicio
        while (cont <= fim) { lista.add(cont + passoTeste) }
    }


    else {
        val cont = inicio
        while (cont >= fim) { lista.add(cont - passoTeste) }
    }

    return lista
}