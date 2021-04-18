package br.kotlin.collections.alura

fun testaFuncaoLambda() {
    //Uso de Returns and Jumps para possibilitar mais de um retorno em um a função lambda
    val calculaSalario: (salario: Double) -> Double = lambda@{
        if (it > 1000.0) {
            return@lambda it + 50.0
        }
        it + 100.0
    }

    println(calculaSalario(2000.0))
}
