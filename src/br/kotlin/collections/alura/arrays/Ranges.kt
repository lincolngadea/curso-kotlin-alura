package br.kotlin.collections.alura.arrays

fun main(){
    //Opção 01
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s,")
    }
    println()
    //Opção 02
    val numerosPares = 0..100 step 2
    for(n in numerosPares){
        print("$n,")
    }
}

