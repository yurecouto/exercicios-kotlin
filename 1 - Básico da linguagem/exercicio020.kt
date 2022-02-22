fun main() {
    val lista = listOf("Alpha", "Lilica", "Kiara", "Salomão", "Pandora")

    // retorna a lista como um shuffle
    val aleatorio = lista.asSequence().shuffled().take(lista.size).toList()
    println(aleatorio)
}