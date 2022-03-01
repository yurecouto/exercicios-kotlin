fun dobro(valor: Int, format: String = "n"): Int {
    return valor * 2
}

fun porcentagemMais (valor: Int, porcent: Double, format: String = "n"): Double {
    val pc = (porcent / 100) + 1
    if (valor == "n") { return valor * pc }
    else { return "R$: ${valor * pc}"}

}

fun porcentagemMenos (valor: Int, porcent: Double, format: String = "n"): Double {
    val pc = (porcent / 100)
    val h = valor * pc

    if (format == "n") { return valor - h }
    else { return "R$: ${valor - h}" }
}

fun moeda (valor: Int): String {
    return "R$: ${valor}"
}

fun resumo(valor: Int, moeda: String, pmais: Double, pmenos: Double, dobro: Int): String {
    return "A moeda é: ${moeda(valor)}\n
            O dobro é: ${dobro(valor)}\n
            P mais é : ${pmais(valor, 15)}\n
            P menos é: ${pmenos(valor, 15)}"

}