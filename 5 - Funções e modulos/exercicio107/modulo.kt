fun dobro(valor: Int): Int {
    return valor * 2
}

fun porcentagemMais (valor: Int, porcent: Double): Double {
    val pc = (porcent / 100) + 1
    return valor * pc
}

fun porcentagemMenos (valor: Int, porcent: Double): Double {
    val pc = (porcent / 100)
    val h = valor * pc
    return valor - h
}