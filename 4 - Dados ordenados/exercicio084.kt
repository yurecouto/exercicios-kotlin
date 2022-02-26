fun main() {
    var helper = ""
    var peso = 0
    var continuar = 0
    var mediaPeso = 0
    var pesos = mutableListOf<Int>()
    var nomes = mutableListOf<String>()
    var acimaMedia = mutableListOf<String>()
    var abaixoMedia = mutableListOf<String>()
    var nome = ""


    while (continuar != 999) {
        print("Digite um nome: ")
        helper = readLine()!!
        nome = helper.toString()

        print("Digite o peso: ")
        helper = readLine()!!
        peso = helper.toInt()

        print("Continuar (999): ")
        helper = readLine()!!
        continuar = helper.toInt()
        pesos.add(peso)
        nomes.add(nome)
    }

    mediaPeso = pesos.sum() / pesos.size
    
    for (n in 0..(nomes.size - 1)) {
        if (pesos[n] > mediaPeso) { acimaMedia.add(nomes[n]) }
        else { abaixoMedia.add(nomes[n])}
    }

    println("${pesos.size} foram cadastrados")
    println("Esses estão ACIMA do peso: ${acimaMedia}")
    println("Esses estão ABAIXO do peso: ${abaixoMedia}")
}