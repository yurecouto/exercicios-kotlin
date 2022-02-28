fun main() {

    fun <K, V> getKey(map: Map<K, V>, target: V): K? {
        for ((key, value) in map){
            if (target == value) { return key }
        }
        return null
    }

    var dado = 1..6
    var resultadosDado = mutableMapOf("Nome" to 0)
    
    for (i in 0..3) {
        print("Digite o nome do jogador: ")
        var nome = readLine()!!
        var resultado = dado.random()
        resultadosDado.put(nome, resultado)
    }


    val resultadosOredenados = resultadosDado.values.sorted()[resultadosDado.size - 1]

    println("O ganhador é: ${getKey(resultadosDado ,resultadosOredenados)} com o resultado: ${resultadosOredenados}")
}