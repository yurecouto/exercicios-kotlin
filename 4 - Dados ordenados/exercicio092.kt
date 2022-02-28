import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    
    var dados = mutableMapOf("Nome" to String(), "Idade" to Int)

    print("Digite o nome: ")
    dados["Nome"] = readLine()!!

    print("Digite o ano de nascimento: ")
    var helper = readLine()!!
    var ano = helper.toInt() 

    val currentDate = LocalDateTime.now()
    val currentYear = currentDate.format(DateTimeFormatter.ofPattern("yyyy"))

    dados["Idade"] = currentYear.toInt() - ano

    print("Digite a carteira de trabalho: (0 caso não tenha) ")
    helper = readLine()!!
    dados["ctps"] = helper.toInt()

    if (dados["ctps"] != 0) {

        print("Digite o seu ano de contratação: ")
        helper = readLine()!!
        ano = helper.toInt()
        dados["Ano"] = ano

        print("Digite o salário em R$: ")
        helper = readLine()!!
        var salario = helper.toInt()

        dados["Salario"] = salario
        dados["Aposentadoria"] = (dados["Ano"] + 35) - ano
    }

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
    for (k, v in dados.)) {
        print(f'{k}: {v}')
    }
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
}