fun main() {
    var retas = mutableListOf<Int>()

    for (a in 1..3){
        print("Digite uma reta: ")
        var r = readLine()!!
        var reta = r.toInt()

        retas.add(reta)
    }

    if (retas[0] < retas[1] + retas[2] && retas[1] < retas[0] + retas[2] && retas[2] < retas[1] + retas[0]) {
        print("Com essas retas é POSSIVEL criar um triangulo")
    }

    else {
        print("Com essas retas é IMPOSSIVEL criar um triangulo")
    }
}