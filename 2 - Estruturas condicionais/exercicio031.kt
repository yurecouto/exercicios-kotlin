fun main() {
    print("Que ano quer analizar? ")
    val a = readLine()!!
    var ano = a.toInt()
    
    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
        print("O ano ${ano} é bissexto.")
    }

    else {
        print("O ano ${ano} não é bissexto.")
    }
}