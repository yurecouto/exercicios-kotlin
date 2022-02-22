fun main() {
    print("Digite sua idade: ")
    val i = readLine()!!
    val idade = i.toInt()

    if (idade <= 9) {
        println("MIRIM")
    }

    else if(9 < idade && idade <= 14) {
        println("INFANTIL")
    }

    else if(14 < idade && idade <= 19) {
        println("JUNIOR")
    }

    else if(19 < idade && idade <= 25) {
        println("SENIOR")
    }

    else {
        println("MASTER")

    }
}