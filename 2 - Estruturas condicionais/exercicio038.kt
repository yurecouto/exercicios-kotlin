import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    print("Digite o ano: ")
    val a = readLine()!!
    val ano = a.toInt()

    // Data e data formatada
    val currentDate = LocalDateTime.now()
    val currentYear = currentDate.format(DateTimeFormatter.ofPattern("yyyy"))

    if ((currentYear.toInt() - ano) < 18) {
        println("Você está novo demais para se alistar")
    }

    else if((currentYear.toInt() - ano) == 18) {
        println("Você está na idade certa para se alistar")
    }

    else {
        println("Você passou da idade de se alistar")
    }

}