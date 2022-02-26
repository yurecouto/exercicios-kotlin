fun main() {
    var lista = mutableListOf<Int>()
    var helper = ""
    var n = 0
    var pos = 0

    for (c in 0..(lista.size - 1)) {
        print("Digite um número: ")
        helper = readLine()!!
        n = helper.toInt()


        if (c == 0 || n > lista[lista.size - 1]) {
            lista.add(n)
        }
        
        else {
            pos = 0
    
            while (pos < lista.size) {
                if (n <= lista[pos]) {
                    lista.add(pos, n)
                    break
                }
                
                pos += 1 
            }
        }
    }

    println(lista)
}