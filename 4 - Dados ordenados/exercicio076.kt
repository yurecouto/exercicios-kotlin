fun main() {
    var produtos = listOf("lapís", 1.75, "borracha", 2, "caderno", 15.90, "estojo", 25, "transferidor", 4.2, "compasso", 9.99, "mochila", 129.99, "canetas", 19.95, "livro", 33.92)
    
    // Fica bem mais ou menos pois kotlin não possui ainda mecanicas para lidar com strings como em python
    for (p in 0..(produtos.size - 1)) {
        if (p % 2 == 0) {
            print("Nome: ${produtos[p]}        ")
        }

        else {
            println("  Preço: R$: ${produtos[p]}")
        }
    }
}