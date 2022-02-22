fun main() {
    for (i in 1..4) {

        print("Digite o seu sexo (M / F): ")
        var s = readLine()!!
        sexo = s.toString() 

        while (sexo !in "MmFf") {

            print("Digite o seu sexo (M / F): ")
            var s = readLine()!!
            sexo = s.toString() 
        }
    }
}