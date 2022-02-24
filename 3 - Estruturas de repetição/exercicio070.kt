fun main() {
    println("BANCO")

    print("Digite o valor para saque: R$:")
    var helper = readLine()!!

    var total = helper.toInt()
    var ced = 50
    var totalced = 0

    while (true) {
        if (total >= ced) {
            total -= ced
            totalced += 1
        }


        else {
            if (totalced > 0) {println("o total ${totalced} de celulas de R$: ${ced}")}

            if (ced == 50) {ced = 20}
        
            else if (ced == 20) {ced = 10}

            else if (ced == 10) {ced = 1}
                
            totalced = 0

            if (total == 0) {break}
        }
    }
}