//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
fun main() {
    var idade = 0
    var soma = -1
    var soma2 = 0

    while (idade != -99){

        print("digite sua idade")
    idade = readLine()!!.toInt()
    if (idade < 21) {
        soma++

    } else if (idade > 50) {
        soma2++
    }
    }
    print("$soma, $soma2")
}