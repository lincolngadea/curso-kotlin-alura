package br.kotlin.collections.alura.arrays

fun main(){
    val valores: IntArray = intArrayOf(100,255,363,456,7,4,-5,66,-1000)

    //Verifica o Valor máximo do array
    val max = valores.maxOrNull()
    println("Valor máximo: $max")

    //Verifica o Valor menor do array
    val min = valores.minOrNull()
    println("Valor menor: $min")
}